// Copyright 2022, University of Freiburg,
// Chair of Algorithms and Data Structures.
// Author: Florian Kramer (florian.kramer@mail.uni-freiburg.de)
#pragma once

#include <cstdint>
#include <initializer_list>
#include <string>
#include <regex>
#include <vector>

#include "data/Variable.h"

class PropertyPath {
 public:
  // DONE-Sven: Added a MIN_MAX operation
  enum class Operation : std::uint8_t {
    SEQUENCE,
    ALTERNATIVE,
    INVERSE,
    IRI,
    ZERO_OR_MORE,
    ONE_OR_MORE,
    ZERO_OR_ONE,
    MIN_MAX
  };

  PropertyPath() : operation_(Operation::IRI) {}
  explicit PropertyPath(Operation op) : operation_(op) {
    if (op == Operation::ZERO_OR_MORE || op == Operation::ZERO_OR_ONE) {
      canBeNull_ = true;
    }
  }
  PropertyPath(Operation op, std::string iri,
               std::initializer_list<PropertyPath> children);

  static PropertyPath fromIri(std::string iri) {
    PropertyPath p(Operation::IRI);
    p.iri_ = std::move(iri);
    return p;
  }

  static PropertyPath fromVariable(const Variable& var) {
    PropertyPath p(Operation::IRI);
    p.iri_ = var.name();
    return p;
  }

  static PropertyPath makeWithChildren(std::vector<PropertyPath> children,
                                       const Operation op) {
    PropertyPath p(op);
    p.children_ = std::move(children);
    return p;
  }

  // DONE-Sven: overloaded makeWithChildren with steps limits
  static PropertyPath makeWithChildren(std::vector<PropertyPath> children,
                                       const Operation op, 
                                       int64_t stepsMin, 
                                       int64_t stepsMax) {
    PropertyPath p(op);
    p.children_ = std::move(children);
    p.min_ = stepsMin;
    p.max_ = stepsMax;
    return p;
  }

  // TODO-Sven: All of these (makeAlternative through makeZeroOrMore are never used?)
  static PropertyPath makeAlternative(std::vector<PropertyPath> children) {
    if (children.size() == 1) {
      return std::move(children.front());
    } else {
      return makeWithChildren(std::move(children), Operation::ALTERNATIVE);
    }
  }

  static PropertyPath makeSequence(std::vector<PropertyPath> children) {
    if (children.size() == 1) {
      return std::move(children.front());
    } else {
      return makeWithChildren(std::move(children), Operation::SEQUENCE);
    }
  }

  static PropertyPath makeInverse(PropertyPath child) {
    return makeWithChildren({std::move(child)}, Operation::INVERSE);
  }

  /**
   * @brief Make a PropertyPath based on the given child and apply the path
   * modifier. The path modifier may be one of: ? + *
   *
   * @param child The PropertyPath child
   * @param modifier A PropertyPath modifier (? + *)
   * @return PropertyPath With given modifier as Operation and given child
   */
  static PropertyPath makeModified(PropertyPath child,
                                   std::string_view modifier);

  // DONE-Sven: overloaded makeModified with steps limits
  static PropertyPath makeModified(PropertyPath child,
                                   std::string_view modifier,
                                   int64_t stepsMin, 
                                   int64_t stepsMax);

  static PropertyPath makeZeroOrMore(PropertyPath child) {
    return makeWithChildren({std::move(child)}, Operation::ZERO_OR_MORE);
  }

  static PropertyPath makeOneOrMore(PropertyPath child) {
    return makeWithChildren({std::move(child)}, Operation::ONE_OR_MORE);
  }

  static PropertyPath makeZeroOrOne(PropertyPath child) {
    return makeWithChildren({std::move(child)}, Operation::ZERO_OR_ONE);
  }

  // TODO-Sven: Will have to add makeMinMax

  bool operator==(const PropertyPath& other) const = default;

  void writeToStream(std::ostream& out) const;
  [[nodiscard]] std::string asString() const;

  void computeCanBeNull();

  // ASSERT that this property path consists of a single IRI and return that
  // IRI.
  [[nodiscard]] const std::string& getIri() const;
  bool isIri() const;

  Operation operation_;
  int min_;
  int max_;

  // In case of an iri
  std::string iri_;

  std::vector<PropertyPath> children_;

  /**
   * True iff this property path is either a transitive path with minimum length
   * of 0, or if all of this transitive path's children can be null.
   */
  bool canBeNull_ = false;
};
