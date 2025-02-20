
// Generated from SparqlAutomatic.g4 by ANTLR 4.11.1

#pragma once


#include "antlr4-runtime.h"




class  SparqlAutomaticLexer : public antlr4::Lexer {
public:
  enum {
    T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, 
    T__7 = 8, T__8 = 9, T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, 
    T__14 = 15, T__15 = 16, T__16 = 17, T__17 = 18, T__18 = 19, T__19 = 20, 
    T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24, T__24 = 25, T__25 = 26, 
    T__26 = 27, T__27 = 28, T__28 = 29, T__29 = 30, BASE = 31, PREFIX = 32, 
    SELECT = 33, DISTINCT = 34, REDUCED = 35, AS = 36, CONSTRUCT = 37, WHERE = 38, 
    DESCRIBE = 39, ASK = 40, FROM = 41, NAMED = 42, GROUPBY = 43, GROUP_CONCAT = 44, 
    HAVING = 45, ORDERBY = 46, INTERNALSORTBY = 47, ASC = 48, DESC = 49, 
    LIMIT = 50, OFFSET = 51, TEXTLIMIT = 52, VALUES = 53, LOAD = 54, SILENT = 55, 
    INTO = 56, CLEAR = 57, DROP = 58, CREATE = 59, ADD = 60, TO = 61, DATA = 62, 
    MOVE = 63, COPY = 64, INSERT = 65, DELETE = 66, WITH = 67, USING = 68, 
    DEFAULT = 69, GRAPH = 70, ALL = 71, OPTIONAL = 72, SERVICE = 73, BIND = 74, 
    UNDEF = 75, MINUS = 76, UNION = 77, FILTER = 78, NOT = 79, IN = 80, 
    STR = 81, LANG = 82, LANGMATCHES = 83, DATATYPE = 84, BOUND = 85, IRI = 86, 
    URI = 87, BNODE = 88, RAND = 89, ABS = 90, CEIL = 91, FLOOR = 92, ROUND = 93, 
    CONCAT = 94, STRLEN = 95, UCASE = 96, LCASE = 97, ENCODE_FOR_URI = 98, 
    FOR = 99, CONTAINS = 100, STRSTARTS = 101, STRENDS = 102, STRBEFORE = 103, 
    STRAFTER = 104, YEAR = 105, MONTH = 106, DAY = 107, HOURS = 108, MINUTES = 109, 
    SECONDS = 110, TIMEZONE = 111, TZ = 112, NOW = 113, UUID = 114, STRUUID = 115, 
    SHA1 = 116, SHA256 = 117, SHA384 = 118, SHA512 = 119, MD5 = 120, COALESCE = 121, 
    IF = 122, STRLANG = 123, STRDT = 124, SAMETERM = 125, ISIRI = 126, ISURI = 127, 
    ISBLANK = 128, ISLITERAL = 129, ISNUMERIC = 130, REGEX = 131, SUBSTR = 132, 
    REPLACE = 133, EXISTS = 134, COUNT = 135, SUM = 136, MIN = 137, MAX = 138, 
    AVG = 139, STDEV = 140, SAMPLE = 141, SEPARATOR = 142, IRI_REF = 143, 
    PNAME_NS = 144, PNAME_LN = 145, BLANK_NODE_LABEL = 146, VAR1 = 147, 
    VAR2 = 148, LANGTAG = 149, PREFIX_LANGTAG = 150, INTEGER = 151, DECIMAL = 152, 
    DOUBLE = 153, INTEGER_POSITIVE = 154, DECIMAL_POSITIVE = 155, DOUBLE_POSITIVE = 156, 
    INTEGER_NEGATIVE = 157, DECIMAL_NEGATIVE = 158, DOUBLE_NEGATIVE = 159, 
    EXPONENT = 160, STRING_LITERAL1 = 161, STRING_LITERAL2 = 162, STRING_LITERAL_LONG1 = 163, 
    STRING_LITERAL_LONG2 = 164, ECHAR = 165, NIL = 166, ANON = 167, PN_CHARS_U = 168, 
    VARNAME = 169, PN_PREFIX = 170, PN_LOCAL = 171, PLX = 172, PERCENT = 173, 
    HEX = 174, PN_LOCAL_ESC = 175, WS = 176, COMMENTS = 177
  };

  explicit SparqlAutomaticLexer(antlr4::CharStream *input);

  ~SparqlAutomaticLexer() override;


  std::string getGrammarFileName() const override;

  const std::vector<std::string>& getRuleNames() const override;

  const std::vector<std::string>& getChannelNames() const override;

  const std::vector<std::string>& getModeNames() const override;

  const antlr4::dfa::Vocabulary& getVocabulary() const override;

  antlr4::atn::SerializedATNView getSerializedATN() const override;

  const antlr4::atn::ATN& getATN() const override;

  // By default the static state used to implement the lexer is lazily initialized during the first
  // call to the constructor. You can call this function if you wish to initialize the static state
  // ahead of time.
  static void initialize();

private:

  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

};

