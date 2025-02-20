// Generated from /home/sven/7/Projects/Open/qlever-code/src/parser/sparqlParser/generated/SparqlAutomatic.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SparqlAutomaticParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, BASE=30, PREFIX=31, 
		SELECT=32, DISTINCT=33, REDUCED=34, AS=35, CONSTRUCT=36, WHERE=37, DESCRIBE=38, 
		ASK=39, FROM=40, NAMED=41, GROUPBY=42, GROUP_CONCAT=43, HAVING=44, ORDERBY=45, 
		INTERNALSORTBY=46, ASC=47, DESC=48, LIMIT=49, OFFSET=50, TEXTLIMIT=51, 
		VALUES=52, LOAD=53, SILENT=54, INTO=55, CLEAR=56, DROP=57, CREATE=58, 
		ADD=59, TO=60, DATA=61, MOVE=62, COPY=63, INSERT=64, DELETE=65, WITH=66, 
		USING=67, DEFAULT=68, GRAPH=69, ALL=70, OPTIONAL=71, SERVICE=72, BIND=73, 
		UNDEF=74, MINUS=75, UNION=76, FILTER=77, NOT=78, IN=79, STR=80, LANG=81, 
		LANGMATCHES=82, DATATYPE=83, BOUND=84, IRI=85, URI=86, BNODE=87, RAND=88, 
		ABS=89, CEIL=90, FLOOR=91, ROUND=92, CONCAT=93, STRLEN=94, UCASE=95, LCASE=96, 
		ENCODE_FOR_URI=97, FOR=98, CONTAINS=99, STRSTARTS=100, STRENDS=101, STRBEFORE=102, 
		STRAFTER=103, YEAR=104, MONTH=105, DAY=106, HOURS=107, MINUTES=108, SECONDS=109, 
		TIMEZONE=110, TZ=111, NOW=112, UUID=113, STRUUID=114, SHA1=115, SHA256=116, 
		SHA384=117, SHA512=118, MD5=119, COALESCE=120, IF=121, STRLANG=122, STRDT=123, 
		SAMETERM=124, ISIRI=125, ISURI=126, ISBLANK=127, ISLITERAL=128, ISNUMERIC=129, 
		REGEX=130, SUBSTR=131, REPLACE=132, EXISTS=133, COUNT=134, SUM=135, MIN=136, 
		MAX=137, AVG=138, STDEV=139, SAMPLE=140, SEPARATOR=141, IRI_REF=142, PNAME_NS=143, 
		PNAME_LN=144, BLANK_NODE_LABEL=145, VAR1=146, VAR2=147, LANGTAG=148, PREFIX_LANGTAG=149, 
		INTEGER=150, DECIMAL=151, DOUBLE=152, INTEGER_POSITIVE=153, DECIMAL_POSITIVE=154, 
		DOUBLE_POSITIVE=155, INTEGER_NEGATIVE=156, DECIMAL_NEGATIVE=157, DOUBLE_NEGATIVE=158, 
		EXPONENT=159, STRING_LITERAL1=160, STRING_LITERAL2=161, STRING_LITERAL_LONG1=162, 
		STRING_LITERAL_LONG2=163, ECHAR=164, NIL=165, ANON=166, PN_CHARS_U=167, 
		VARNAME=168, PN_PREFIX=169, PN_LOCAL=170, PLX=171, PERCENT=172, HEX=173, 
		PN_LOCAL_ESC=174, WS=175, COMMENTS=176;
	public static final int
		RULE_queryOrUpdate = 0, RULE_query = 1, RULE_prologue = 2, RULE_baseDecl = 3, 
		RULE_prefixDecl = 4, RULE_selectQuery = 5, RULE_subSelect = 6, RULE_selectClause = 7, 
		RULE_varOrAlias = 8, RULE_alias = 9, RULE_aliasWithoutBrackets = 10, RULE_constructQuery = 11, 
		RULE_describeQuery = 12, RULE_askQuery = 13, RULE_datasetClause = 14, 
		RULE_defaultGraphClause = 15, RULE_namedGraphClause = 16, RULE_sourceSelector = 17, 
		RULE_whereClause = 18, RULE_solutionModifier = 19, RULE_groupClause = 20, 
		RULE_groupCondition = 21, RULE_havingClause = 22, RULE_havingCondition = 23, 
		RULE_orderClause = 24, RULE_orderCondition = 25, RULE_limitOffsetClauses = 26, 
		RULE_limitClause = 27, RULE_offsetClause = 28, RULE_textLimitClause = 29, 
		RULE_valuesClause = 30, RULE_update = 31, RULE_update1 = 32, RULE_load = 33, 
		RULE_clear = 34, RULE_drop = 35, RULE_create = 36, RULE_add = 37, RULE_move = 38, 
		RULE_copy = 39, RULE_insertData = 40, RULE_deleteData = 41, RULE_deleteWhere = 42, 
		RULE_modify = 43, RULE_deleteClause = 44, RULE_insertClause = 45, RULE_usingClause = 46, 
		RULE_graphOrDefault = 47, RULE_graphRef = 48, RULE_graphRefAll = 49, RULE_quadPattern = 50, 
		RULE_quadData = 51, RULE_quads = 52, RULE_quadsNotTriples = 53, RULE_triplesTemplate = 54, 
		RULE_groupGraphPattern = 55, RULE_groupGraphPatternSub = 56, RULE_graphPatternNotTriplesAndMaybeTriples = 57, 
		RULE_triplesBlock = 58, RULE_graphPatternNotTriples = 59, RULE_optionalGraphPattern = 60, 
		RULE_graphGraphPattern = 61, RULE_serviceGraphPattern = 62, RULE_bind = 63, 
		RULE_inlineData = 64, RULE_dataBlock = 65, RULE_inlineDataOneVar = 66, 
		RULE_inlineDataFull = 67, RULE_dataBlockSingle = 68, RULE_dataBlockValue = 69, 
		RULE_minusGraphPattern = 70, RULE_groupOrUnionGraphPattern = 71, RULE_filterR = 72, 
		RULE_constraint = 73, RULE_functionCall = 74, RULE_argList = 75, RULE_expressionList = 76, 
		RULE_constructTemplate = 77, RULE_constructTriples = 78, RULE_triplesSameSubject = 79, 
		RULE_propertyList = 80, RULE_propertyListNotEmpty = 81, RULE_verb = 82, 
		RULE_objectList = 83, RULE_objectR = 84, RULE_triplesSameSubjectPath = 85, 
		RULE_propertyListPath = 86, RULE_propertyListPathNotEmpty = 87, RULE_verbPath = 88, 
		RULE_verbSimple = 89, RULE_tupleWithoutPath = 90, RULE_tupleWithPath = 91, 
		RULE_verbPathOrSimple = 92, RULE_objectListPath = 93, RULE_objectPath = 94, 
		RULE_path = 95, RULE_pathAlternative = 96, RULE_pathSequence = 97, RULE_pathElt = 98, 
		RULE_pathEltOrInverse = 99, RULE_pathMod = 100, RULE_stepsMin = 101, RULE_stepsMax = 102, 
		RULE_pathPrimary = 103, RULE_pathNegatedPropertySet = 104, RULE_pathOneInPropertySet = 105, 
		RULE_integer = 106, RULE_triplesNode = 107, RULE_blankNodePropertyList = 108, 
		RULE_triplesNodePath = 109, RULE_blankNodePropertyListPath = 110, RULE_collection = 111, 
		RULE_collectionPath = 112, RULE_graphNode = 113, RULE_graphNodePath = 114, 
		RULE_varOrTerm = 115, RULE_varOrIri = 116, RULE_var = 117, RULE_graphTerm = 118, 
		RULE_expression = 119, RULE_conditionalOrExpression = 120, RULE_conditionalAndExpression = 121, 
		RULE_valueLogical = 122, RULE_relationalExpression = 123, RULE_numericExpression = 124, 
		RULE_additiveExpression = 125, RULE_multiplicativeExpressionWithSign = 126, 
		RULE_plusSubexpression = 127, RULE_minusSubexpression = 128, RULE_multiplicativeExpressionWithLeadingSignButNoSpace = 129, 
		RULE_multiplicativeExpression = 130, RULE_multiplyOrDivideExpression = 131, 
		RULE_multiplyExpression = 132, RULE_divideExpression = 133, RULE_unaryExpression = 134, 
		RULE_primaryExpression = 135, RULE_brackettedExpression = 136, RULE_builtInCall = 137, 
		RULE_regexExpression = 138, RULE_langExpression = 139, RULE_substringExpression = 140, 
		RULE_strReplaceExpression = 141, RULE_existsFunc = 142, RULE_notExistsFunc = 143, 
		RULE_aggregate = 144, RULE_iriOrFunction = 145, RULE_rdfLiteral = 146, 
		RULE_numericLiteral = 147, RULE_numericLiteralUnsigned = 148, RULE_numericLiteralPositive = 149, 
		RULE_numericLiteralNegative = 150, RULE_booleanLiteral = 151, RULE_string = 152, 
		RULE_iri = 153, RULE_prefixedName = 154, RULE_blankNode = 155, RULE_iriref = 156, 
		RULE_pnameLn = 157, RULE_pnameNs = 158;
	private static String[] makeRuleNames() {
		return new String[] {
			"queryOrUpdate", "query", "prologue", "baseDecl", "prefixDecl", "selectQuery", 
			"subSelect", "selectClause", "varOrAlias", "alias", "aliasWithoutBrackets", 
			"constructQuery", "describeQuery", "askQuery", "datasetClause", "defaultGraphClause", 
			"namedGraphClause", "sourceSelector", "whereClause", "solutionModifier", 
			"groupClause", "groupCondition", "havingClause", "havingCondition", "orderClause", 
			"orderCondition", "limitOffsetClauses", "limitClause", "offsetClause", 
			"textLimitClause", "valuesClause", "update", "update1", "load", "clear", 
			"drop", "create", "add", "move", "copy", "insertData", "deleteData", 
			"deleteWhere", "modify", "deleteClause", "insertClause", "usingClause", 
			"graphOrDefault", "graphRef", "graphRefAll", "quadPattern", "quadData", 
			"quads", "quadsNotTriples", "triplesTemplate", "groupGraphPattern", "groupGraphPatternSub", 
			"graphPatternNotTriplesAndMaybeTriples", "triplesBlock", "graphPatternNotTriples", 
			"optionalGraphPattern", "graphGraphPattern", "serviceGraphPattern", "bind", 
			"inlineData", "dataBlock", "inlineDataOneVar", "inlineDataFull", "dataBlockSingle", 
			"dataBlockValue", "minusGraphPattern", "groupOrUnionGraphPattern", "filterR", 
			"constraint", "functionCall", "argList", "expressionList", "constructTemplate", 
			"constructTriples", "triplesSameSubject", "propertyList", "propertyListNotEmpty", 
			"verb", "objectList", "objectR", "triplesSameSubjectPath", "propertyListPath", 
			"propertyListPathNotEmpty", "verbPath", "verbSimple", "tupleWithoutPath", 
			"tupleWithPath", "verbPathOrSimple", "objectListPath", "objectPath", 
			"path", "pathAlternative", "pathSequence", "pathElt", "pathEltOrInverse", 
			"pathMod", "stepsMin", "stepsMax", "pathPrimary", "pathNegatedPropertySet", 
			"pathOneInPropertySet", "integer", "triplesNode", "blankNodePropertyList", 
			"triplesNodePath", "blankNodePropertyListPath", "collection", "collectionPath", 
			"graphNode", "graphNodePath", "varOrTerm", "varOrIri", "var", "graphTerm", 
			"expression", "conditionalOrExpression", "conditionalAndExpression", 
			"valueLogical", "relationalExpression", "numericExpression", "additiveExpression", 
			"multiplicativeExpressionWithSign", "plusSubexpression", "minusSubexpression", 
			"multiplicativeExpressionWithLeadingSignButNoSpace", "multiplicativeExpression", 
			"multiplyOrDivideExpression", "multiplyExpression", "divideExpression", 
			"unaryExpression", "primaryExpression", "brackettedExpression", "builtInCall", 
			"regexExpression", "langExpression", "substringExpression", "strReplaceExpression", 
			"existsFunc", "notExistsFunc", "aggregate", "iriOrFunction", "rdfLiteral", 
			"numericLiteral", "numericLiteralUnsigned", "numericLiteralPositive", 
			"numericLiteralNegative", "booleanLiteral", "string", "iri", "prefixedName", 
			"blankNode", "iriref", "pnameLn", "pnameNs"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'('", "')'", "'{'", "'}'", "';'", "'.'", "','", "'a'", 
			"'|'", "'/'", "'^'", "'+'", "'?'", "'!'", "'['", "']'", "'||'", "'&&'", 
			"'='", "'!='", "'<'", "'>'", "'<='", "'>='", "'-'", "'^^'", "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "BASE", "PREFIX", "SELECT", "DISTINCT", 
			"REDUCED", "AS", "CONSTRUCT", "WHERE", "DESCRIBE", "ASK", "FROM", "NAMED", 
			"GROUPBY", "GROUP_CONCAT", "HAVING", "ORDERBY", "INTERNALSORTBY", "ASC", 
			"DESC", "LIMIT", "OFFSET", "TEXTLIMIT", "VALUES", "LOAD", "SILENT", "INTO", 
			"CLEAR", "DROP", "CREATE", "ADD", "TO", "DATA", "MOVE", "COPY", "INSERT", 
			"DELETE", "WITH", "USING", "DEFAULT", "GRAPH", "ALL", "OPTIONAL", "SERVICE", 
			"BIND", "UNDEF", "MINUS", "UNION", "FILTER", "NOT", "IN", "STR", "LANG", 
			"LANGMATCHES", "DATATYPE", "BOUND", "IRI", "URI", "BNODE", "RAND", "ABS", 
			"CEIL", "FLOOR", "ROUND", "CONCAT", "STRLEN", "UCASE", "LCASE", "ENCODE_FOR_URI", 
			"FOR", "CONTAINS", "STRSTARTS", "STRENDS", "STRBEFORE", "STRAFTER", "YEAR", 
			"MONTH", "DAY", "HOURS", "MINUTES", "SECONDS", "TIMEZONE", "TZ", "NOW", 
			"UUID", "STRUUID", "SHA1", "SHA256", "SHA384", "SHA512", "MD5", "COALESCE", 
			"IF", "STRLANG", "STRDT", "SAMETERM", "ISIRI", "ISURI", "ISBLANK", "ISLITERAL", 
			"ISNUMERIC", "REGEX", "SUBSTR", "REPLACE", "EXISTS", "COUNT", "SUM", 
			"MIN", "MAX", "AVG", "STDEV", "SAMPLE", "SEPARATOR", "IRI_REF", "PNAME_NS", 
			"PNAME_LN", "BLANK_NODE_LABEL", "VAR1", "VAR2", "LANGTAG", "PREFIX_LANGTAG", 
			"INTEGER", "DECIMAL", "DOUBLE", "INTEGER_POSITIVE", "DECIMAL_POSITIVE", 
			"DOUBLE_POSITIVE", "INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", 
			"EXPONENT", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", 
			"STRING_LITERAL_LONG2", "ECHAR", "NIL", "ANON", "PN_CHARS_U", "VARNAME", 
			"PN_PREFIX", "PN_LOCAL", "PLX", "PERCENT", "HEX", "PN_LOCAL_ESC", "WS", 
			"COMMENTS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SparqlAutomatic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SparqlAutomaticParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryOrUpdateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SparqlAutomaticParser.EOF, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public QueryOrUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrUpdate; }
	}

	public final QueryOrUpdateContext queryOrUpdate() throws RecognitionException {
		QueryOrUpdateContext _localctx = new QueryOrUpdateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queryOrUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(318);
				query();
				}
				break;
			case 2:
				{
				setState(319);
				update();
				}
				break;
			}
			setState(322);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public PrologueContext prologue() {
			return getRuleContext(PrologueContext.class,0);
		}
		public ValuesClauseContext valuesClause() {
			return getRuleContext(ValuesClauseContext.class,0);
		}
		public SelectQueryContext selectQuery() {
			return getRuleContext(SelectQueryContext.class,0);
		}
		public ConstructQueryContext constructQuery() {
			return getRuleContext(ConstructQueryContext.class,0);
		}
		public DescribeQueryContext describeQuery() {
			return getRuleContext(DescribeQueryContext.class,0);
		}
		public AskQueryContext askQuery() {
			return getRuleContext(AskQueryContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			prologue();
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(325);
				selectQuery();
				}
				break;
			case CONSTRUCT:
				{
				setState(326);
				constructQuery();
				}
				break;
			case DESCRIBE:
				{
				setState(327);
				describeQuery();
				}
				break;
			case ASK:
				{
				setState(328);
				askQuery();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(331);
			valuesClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrologueContext extends ParserRuleContext {
		public List<BaseDeclContext> baseDecl() {
			return getRuleContexts(BaseDeclContext.class);
		}
		public BaseDeclContext baseDecl(int i) {
			return getRuleContext(BaseDeclContext.class,i);
		}
		public List<PrefixDeclContext> prefixDecl() {
			return getRuleContexts(PrefixDeclContext.class);
		}
		public PrefixDeclContext prefixDecl(int i) {
			return getRuleContext(PrefixDeclContext.class,i);
		}
		public PrologueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prologue; }
	}

	public final PrologueContext prologue() throws RecognitionException {
		PrologueContext _localctx = new PrologueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prologue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BASE || _la==PREFIX) {
				{
				setState(335);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BASE:
					{
					setState(333);
					baseDecl();
					}
					break;
				case PREFIX:
					{
					setState(334);
					prefixDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseDeclContext extends ParserRuleContext {
		public TerminalNode BASE() { return getToken(SparqlAutomaticParser.BASE, 0); }
		public IrirefContext iriref() {
			return getRuleContext(IrirefContext.class,0);
		}
		public BaseDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseDecl; }
	}

	public final BaseDeclContext baseDecl() throws RecognitionException {
		BaseDeclContext _localctx = new BaseDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_baseDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(BASE);
			setState(341);
			iriref();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixDeclContext extends ParserRuleContext {
		public TerminalNode PREFIX() { return getToken(SparqlAutomaticParser.PREFIX, 0); }
		public TerminalNode PNAME_NS() { return getToken(SparqlAutomaticParser.PNAME_NS, 0); }
		public IrirefContext iriref() {
			return getRuleContext(IrirefContext.class,0);
		}
		public PrefixDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixDecl; }
	}

	public final PrefixDeclContext prefixDecl() throws RecognitionException {
		PrefixDeclContext _localctx = new PrefixDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_prefixDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(PREFIX);
			setState(344);
			match(PNAME_NS);
			setState(345);
			iriref();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectQueryContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public SelectQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectQuery; }
	}

	public final SelectQueryContext selectQuery() throws RecognitionException {
		SelectQueryContext _localctx = new SelectQueryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			selectClause();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FROM) {
				{
				{
				setState(348);
				datasetClause();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			whereClause();
			setState(355);
			solutionModifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubSelectContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public ValuesClauseContext valuesClause() {
			return getRuleContext(ValuesClauseContext.class,0);
		}
		public SubSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subSelect; }
	}

	public final SubSelectContext subSelect() throws RecognitionException {
		SubSelectContext _localctx = new SubSelectContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_subSelect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			selectClause();
			setState(358);
			whereClause();
			setState(359);
			solutionModifier();
			setState(360);
			valuesClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectClauseContext extends ParserRuleContext {
		public Token asterisk;
		public TerminalNode SELECT() { return getToken(SparqlAutomaticParser.SELECT, 0); }
		public TerminalNode DISTINCT() { return getToken(SparqlAutomaticParser.DISTINCT, 0); }
		public TerminalNode REDUCED() { return getToken(SparqlAutomaticParser.REDUCED, 0); }
		public List<VarOrAliasContext> varOrAlias() {
			return getRuleContexts(VarOrAliasContext.class);
		}
		public VarOrAliasContext varOrAlias(int i) {
			return getRuleContext(VarOrAliasContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(SELECT);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==REDUCED) {
				{
				setState(363);
				_la = _input.LA(1);
				if ( !(_la==DISTINCT || _la==REDUCED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case VAR1:
			case VAR2:
				{
				setState(367); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(366);
					varOrAlias();
					}
					}
					setState(369); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 || _la==VAR1 || _la==VAR2 );
				}
				break;
			case T__0:
				{
				setState(371);
				((SelectClauseContext)_localctx).asterisk = match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarOrAliasContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public VarOrAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrAlias; }
	}

	public final VarOrAliasContext varOrAlias() throws RecognitionException {
		VarOrAliasContext _localctx = new VarOrAliasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varOrAlias);
		try {
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				var();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				alias();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public AliasWithoutBracketsContext aliasWithoutBrackets() {
			return getRuleContext(AliasWithoutBracketsContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(378);
			match(T__1);
			setState(379);
			aliasWithoutBrackets();
			setState(380);
			match(T__2);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasWithoutBracketsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparqlAutomaticParser.AS, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AliasWithoutBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasWithoutBrackets; }
	}

	public final AliasWithoutBracketsContext aliasWithoutBrackets() throws RecognitionException {
		AliasWithoutBracketsContext _localctx = new AliasWithoutBracketsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_aliasWithoutBrackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(382);
			expression();
			setState(383);
			match(AS);
			setState(384);
			var();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructQueryContext extends ParserRuleContext {
		public TerminalNode CONSTRUCT() { return getToken(SparqlAutomaticParser.CONSTRUCT, 0); }
		public ConstructTemplateContext constructTemplate() {
			return getRuleContext(ConstructTemplateContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SparqlAutomaticParser.WHERE, 0); }
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public TriplesTemplateContext triplesTemplate() {
			return getRuleContext(TriplesTemplateContext.class,0);
		}
		public ConstructQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructQuery; }
	}

	public final ConstructQueryContext constructQuery() throws RecognitionException {
		ConstructQueryContext _localctx = new ConstructQueryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constructQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(CONSTRUCT);
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(387);
				constructTemplate();
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FROM) {
					{
					{
					setState(388);
					datasetClause();
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(394);
				whereClause();
				setState(395);
				solutionModifier();
				}
				break;
			case WHERE:
			case FROM:
				{
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FROM) {
					{
					{
					setState(397);
					datasetClause();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				match(WHERE);
				setState(404);
				match(T__3);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 805371908L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 29228991L) != 0)) {
					{
					setState(405);
					triplesTemplate();
					}
				}

				setState(408);
				match(T__4);
				setState(409);
				solutionModifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescribeQueryContext extends ParserRuleContext {
		public TerminalNode DESCRIBE() { return getToken(SparqlAutomaticParser.DESCRIBE, 0); }
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<VarOrIriContext> varOrIri() {
			return getRuleContexts(VarOrIriContext.class);
		}
		public VarOrIriContext varOrIri(int i) {
			return getRuleContext(VarOrIriContext.class,i);
		}
		public DescribeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeQuery; }
	}

	public final DescribeQueryContext describeQuery() throws RecognitionException {
		DescribeQueryContext _localctx = new DescribeQueryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_describeQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(DESCRIBE);
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR1:
			case VAR2:
			case PREFIX_LANGTAG:
				{
				setState(414); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(413);
					varOrIri();
					}
					}
					setState(416); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 183L) != 0) );
				}
				break;
			case T__0:
				{
				setState(418);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FROM) {
				{
				{
				setState(421);
				datasetClause();
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==WHERE) {
				{
				setState(427);
				whereClause();
				}
			}

			setState(430);
			solutionModifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AskQueryContext extends ParserRuleContext {
		public TerminalNode ASK() { return getToken(SparqlAutomaticParser.ASK, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public AskQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_askQuery; }
	}

	public final AskQueryContext askQuery() throws RecognitionException {
		AskQueryContext _localctx = new AskQueryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_askQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(ASK);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FROM) {
				{
				{
				setState(433);
				datasetClause();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
			whereClause();
			setState(440);
			solutionModifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DatasetClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SparqlAutomaticParser.FROM, 0); }
		public DefaultGraphClauseContext defaultGraphClause() {
			return getRuleContext(DefaultGraphClauseContext.class,0);
		}
		public NamedGraphClauseContext namedGraphClause() {
			return getRuleContext(NamedGraphClauseContext.class,0);
		}
		public DatasetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasetClause; }
	}

	public final DatasetClauseContext datasetClause() throws RecognitionException {
		DatasetClauseContext _localctx = new DatasetClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_datasetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(FROM);
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case PREFIX_LANGTAG:
				{
				setState(443);
				defaultGraphClause();
				}
				break;
			case NAMED:
				{
				setState(444);
				namedGraphClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultGraphClauseContext extends ParserRuleContext {
		public SourceSelectorContext sourceSelector() {
			return getRuleContext(SourceSelectorContext.class,0);
		}
		public DefaultGraphClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultGraphClause; }
	}

	public final DefaultGraphClauseContext defaultGraphClause() throws RecognitionException {
		DefaultGraphClauseContext _localctx = new DefaultGraphClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_defaultGraphClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			sourceSelector();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedGraphClauseContext extends ParserRuleContext {
		public TerminalNode NAMED() { return getToken(SparqlAutomaticParser.NAMED, 0); }
		public SourceSelectorContext sourceSelector() {
			return getRuleContext(SourceSelectorContext.class,0);
		}
		public NamedGraphClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedGraphClause; }
	}

	public final NamedGraphClauseContext namedGraphClause() throws RecognitionException {
		NamedGraphClauseContext _localctx = new NamedGraphClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_namedGraphClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(NAMED);
			setState(450);
			sourceSelector();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceSelectorContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public SourceSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceSelector; }
	}

	public final SourceSelectorContext sourceSelector() throws RecognitionException {
		SourceSelectorContext _localctx = new SourceSelectorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sourceSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			iri();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SparqlAutomaticParser.WHERE, 0); }
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(454);
				match(WHERE);
				}
			}

			setState(457);
			groupGraphPattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SolutionModifierContext extends ParserRuleContext {
		public GroupClauseContext groupClause() {
			return getRuleContext(GroupClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderClauseContext orderClause() {
			return getRuleContext(OrderClauseContext.class,0);
		}
		public LimitOffsetClausesContext limitOffsetClauses() {
			return getRuleContext(LimitOffsetClausesContext.class,0);
		}
		public SolutionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solutionModifier; }
	}

	public final SolutionModifierContext solutionModifier() throws RecognitionException {
		SolutionModifierContext _localctx = new SolutionModifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_solutionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUPBY) {
				{
				setState(459);
				groupClause();
				}
			}

			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(462);
				havingClause();
				}
			}

			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDERBY || _la==INTERNALSORTBY) {
				{
				setState(465);
				orderClause();
				}
			}

			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0)) {
				{
				setState(468);
				limitOffsetClauses();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupClauseContext extends ParserRuleContext {
		public TerminalNode GROUPBY() { return getToken(SparqlAutomaticParser.GROUPBY, 0); }
		public List<GroupConditionContext> groupCondition() {
			return getRuleContexts(GroupConditionContext.class);
		}
		public GroupConditionContext groupCondition(int i) {
			return getRuleContext(GroupConditionContext.class,i);
		}
		public GroupClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupClause; }
	}

	public final GroupClauseContext groupClause() throws RecognitionException {
		GroupClauseContext _localctx = new GroupClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_groupClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(GROUPBY);
			setState(473); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(472);
				groupCondition();
				}
				}
				setState(475); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==GROUP_CONCAT || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 9223372036853727229L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 183L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupConditionContext extends ParserRuleContext {
		public BuiltInCallContext builtInCall() {
			return getRuleContext(BuiltInCallContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparqlAutomaticParser.AS, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public GroupConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupCondition; }
	}

	public final GroupConditionContext groupCondition() throws RecognitionException {
		GroupConditionContext _localctx = new GroupConditionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_groupCondition);
		int _la;
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP_CONCAT:
			case NOT:
			case STR:
			case LANG:
			case LANGMATCHES:
			case DATATYPE:
			case BOUND:
			case IRI:
			case URI:
			case BNODE:
			case RAND:
			case ABS:
			case CEIL:
			case FLOOR:
			case ROUND:
			case CONCAT:
			case STRLEN:
			case UCASE:
			case LCASE:
			case ENCODE_FOR_URI:
			case CONTAINS:
			case STRSTARTS:
			case STRENDS:
			case STRBEFORE:
			case STRAFTER:
			case YEAR:
			case MONTH:
			case DAY:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case TIMEZONE:
			case TZ:
			case NOW:
			case UUID:
			case STRUUID:
			case SHA1:
			case SHA256:
			case SHA384:
			case SHA512:
			case MD5:
			case COALESCE:
			case IF:
			case STRLANG:
			case STRDT:
			case SAMETERM:
			case ISIRI:
			case ISURI:
			case ISBLANK:
			case ISLITERAL:
			case ISNUMERIC:
			case REGEX:
			case SUBSTR:
			case REPLACE:
			case EXISTS:
			case COUNT:
			case SUM:
			case MIN:
			case MAX:
			case AVG:
			case STDEV:
			case SAMPLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				builtInCall();
				}
				break;
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case PREFIX_LANGTAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				functionCall();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				match(T__1);
				setState(480);
				expression();
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(481);
					match(AS);
					setState(482);
					var();
					}
				}

				setState(485);
				match(T__2);
				}
				break;
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SparqlAutomaticParser.HAVING, 0); }
		public List<HavingConditionContext> havingCondition() {
			return getRuleContexts(HavingConditionContext.class);
		}
		public HavingConditionContext havingCondition(int i) {
			return getRuleContext(HavingConditionContext.class,i);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_havingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(HAVING);
			setState(492); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(491);
				havingCondition();
				}
				}
				setState(494); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==GROUP_CONCAT || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 9223372036853727229L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 135L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HavingConditionContext extends ParserRuleContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public HavingConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingCondition; }
	}

	public final HavingConditionContext havingCondition() throws RecognitionException {
		HavingConditionContext _localctx = new HavingConditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_havingCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderClauseContext extends ParserRuleContext {
		public Token orderBy;
		public Token internalSortBy;
		public TerminalNode ORDERBY() { return getToken(SparqlAutomaticParser.ORDERBY, 0); }
		public TerminalNode INTERNALSORTBY() { return getToken(SparqlAutomaticParser.INTERNALSORTBY, 0); }
		public List<OrderConditionContext> orderCondition() {
			return getRuleContexts(OrderConditionContext.class);
		}
		public OrderConditionContext orderCondition(int i) {
			return getRuleContext(OrderConditionContext.class,i);
		}
		public OrderClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderClause; }
	}

	public final OrderClauseContext orderClause() throws RecognitionException {
		OrderClauseContext _localctx = new OrderClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_orderClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORDERBY:
				{
				setState(498);
				((OrderClauseContext)_localctx).orderBy = match(ORDERBY);
				}
				break;
			case INTERNALSORTBY:
				{
				setState(499);
				((OrderClauseContext)_localctx).internalSortBy = match(INTERNALSORTBY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(503); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(502);
				orderCondition();
				}
				}
				setState(505); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 431008558088196L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 9223372036853727229L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 183L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderConditionContext extends ParserRuleContext {
		public BrackettedExpressionContext brackettedExpression() {
			return getRuleContext(BrackettedExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SparqlAutomaticParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparqlAutomaticParser.DESC, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OrderConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderCondition; }
	}

	public final OrderConditionContext orderCondition() throws RecognitionException {
		OrderConditionContext _localctx = new OrderConditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_orderCondition);
		int _la;
		try {
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
			case DESC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(507);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(508);
				brackettedExpression();
				}
				}
				break;
			case T__1:
			case GROUP_CONCAT:
			case NOT:
			case STR:
			case LANG:
			case LANGMATCHES:
			case DATATYPE:
			case BOUND:
			case IRI:
			case URI:
			case BNODE:
			case RAND:
			case ABS:
			case CEIL:
			case FLOOR:
			case ROUND:
			case CONCAT:
			case STRLEN:
			case UCASE:
			case LCASE:
			case ENCODE_FOR_URI:
			case CONTAINS:
			case STRSTARTS:
			case STRENDS:
			case STRBEFORE:
			case STRAFTER:
			case YEAR:
			case MONTH:
			case DAY:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case TIMEZONE:
			case TZ:
			case NOW:
			case UUID:
			case STRUUID:
			case SHA1:
			case SHA256:
			case SHA384:
			case SHA512:
			case MD5:
			case COALESCE:
			case IF:
			case STRLANG:
			case STRDT:
			case SAMETERM:
			case ISIRI:
			case ISURI:
			case ISBLANK:
			case ISLITERAL:
			case ISNUMERIC:
			case REGEX:
			case SUBSTR:
			case REPLACE:
			case EXISTS:
			case COUNT:
			case SUM:
			case MIN:
			case MAX:
			case AVG:
			case STDEV:
			case SAMPLE:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR1:
			case VAR2:
			case PREFIX_LANGTAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case GROUP_CONCAT:
				case NOT:
				case STR:
				case LANG:
				case LANGMATCHES:
				case DATATYPE:
				case BOUND:
				case IRI:
				case URI:
				case BNODE:
				case RAND:
				case ABS:
				case CEIL:
				case FLOOR:
				case ROUND:
				case CONCAT:
				case STRLEN:
				case UCASE:
				case LCASE:
				case ENCODE_FOR_URI:
				case CONTAINS:
				case STRSTARTS:
				case STRENDS:
				case STRBEFORE:
				case STRAFTER:
				case YEAR:
				case MONTH:
				case DAY:
				case HOURS:
				case MINUTES:
				case SECONDS:
				case TIMEZONE:
				case TZ:
				case NOW:
				case UUID:
				case STRUUID:
				case SHA1:
				case SHA256:
				case SHA384:
				case SHA512:
				case MD5:
				case COALESCE:
				case IF:
				case STRLANG:
				case STRDT:
				case SAMETERM:
				case ISIRI:
				case ISURI:
				case ISBLANK:
				case ISLITERAL:
				case ISNUMERIC:
				case REGEX:
				case SUBSTR:
				case REPLACE:
				case EXISTS:
				case COUNT:
				case SUM:
				case MIN:
				case MAX:
				case AVG:
				case STDEV:
				case SAMPLE:
				case IRI_REF:
				case PNAME_NS:
				case PNAME_LN:
				case PREFIX_LANGTAG:
					{
					setState(509);
					constraint();
					}
					break;
				case VAR1:
				case VAR2:
					{
					setState(510);
					var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitOffsetClausesContext extends ParserRuleContext {
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public TextLimitClauseContext textLimitClause() {
			return getRuleContext(TextLimitClauseContext.class,0);
		}
		public LimitOffsetClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitOffsetClauses; }
	}

	public final LimitOffsetClausesContext limitOffsetClauses() throws RecognitionException {
		LimitOffsetClausesContext _localctx = new LimitOffsetClausesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_limitOffsetClauses);
		int _la;
		try {
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				limitClause();
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(516);
					offsetClause();
					}
				}

				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEXTLIMIT) {
					{
					setState(519);
					textLimitClause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				limitClause();
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEXTLIMIT) {
					{
					setState(523);
					textLimitClause();
					}
				}

				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(526);
					offsetClause();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				offsetClause();
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(530);
					limitClause();
					}
				}

				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEXTLIMIT) {
					{
					setState(533);
					textLimitClause();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(536);
				offsetClause();
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEXTLIMIT) {
					{
					setState(537);
					textLimitClause();
					}
				}

				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(540);
					limitClause();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(543);
				textLimitClause();
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(544);
					offsetClause();
					}
				}

				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(547);
					limitClause();
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(550);
				textLimitClause();
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(551);
					limitClause();
					}
				}

				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(554);
					offsetClause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(SparqlAutomaticParser.LIMIT, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(LIMIT);
			setState(560);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OffsetClauseContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(SparqlAutomaticParser.OFFSET, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public OffsetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetClause; }
	}

	public final OffsetClauseContext offsetClause() throws RecognitionException {
		OffsetClauseContext _localctx = new OffsetClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_offsetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(OFFSET);
			setState(563);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextLimitClauseContext extends ParserRuleContext {
		public TerminalNode TEXTLIMIT() { return getToken(SparqlAutomaticParser.TEXTLIMIT, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TextLimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textLimitClause; }
	}

	public final TextLimitClauseContext textLimitClause() throws RecognitionException {
		TextLimitClauseContext _localctx = new TextLimitClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_textLimitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(TEXTLIMIT);
			setState(566);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesClauseContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SparqlAutomaticParser.VALUES, 0); }
		public DataBlockContext dataBlock() {
			return getRuleContext(DataBlockContext.class,0);
		}
		public ValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesClause; }
	}

	public final ValuesClauseContext valuesClause() throws RecognitionException {
		ValuesClauseContext _localctx = new ValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_valuesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUES) {
				{
				setState(568);
				match(VALUES);
				setState(569);
				dataBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateContext extends ParserRuleContext {
		public PrologueContext prologue() {
			return getRuleContext(PrologueContext.class,0);
		}
		public Update1Context update1() {
			return getRuleContext(Update1Context.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			prologue();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 15993L) != 0)) {
				{
				setState(573);
				update1();
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(574);
					match(T__5);
					setState(575);
					update();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update1Context extends ParserRuleContext {
		public LoadContext load() {
			return getRuleContext(LoadContext.class,0);
		}
		public ClearContext clear() {
			return getRuleContext(ClearContext.class,0);
		}
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public CopyContext copy() {
			return getRuleContext(CopyContext.class,0);
		}
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public InsertDataContext insertData() {
			return getRuleContext(InsertDataContext.class,0);
		}
		public DeleteDataContext deleteData() {
			return getRuleContext(DeleteDataContext.class,0);
		}
		public DeleteWhereContext deleteWhere() {
			return getRuleContext(DeleteWhereContext.class,0);
		}
		public ModifyContext modify() {
			return getRuleContext(ModifyContext.class,0);
		}
		public Update1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update1; }
	}

	public final Update1Context update1() throws RecognitionException {
		Update1Context _localctx = new Update1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_update1);
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				load();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				clear();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
				drop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(583);
				add();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(584);
				move();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(585);
				copy();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(586);
				create();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(587);
				insertData();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(588);
				deleteData();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(589);
				deleteWhere();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(590);
				modify();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoadContext extends ParserRuleContext {
		public TerminalNode LOAD() { return getToken(SparqlAutomaticParser.LOAD, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode SILENT() { return getToken(SparqlAutomaticParser.SILENT, 0); }
		public TerminalNode INTO() { return getToken(SparqlAutomaticParser.INTO, 0); }
		public GraphRefContext graphRef() {
			return getRuleContext(GraphRefContext.class,0);
		}
		public LoadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load; }
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_load);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(LOAD);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SILENT) {
				{
				setState(594);
				match(SILENT);
				}
			}

			setState(597);
			iri();
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(598);
				match(INTO);
				setState(599);
				graphRef();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClearContext extends ParserRuleContext {
		public TerminalNode CLEAR() { return getToken(SparqlAutomaticParser.CLEAR, 0); }
		public GraphRefAllContext graphRefAll() {
			return getRuleContext(GraphRefAllContext.class,0);
		}
		public TerminalNode SILENT() { return getToken(SparqlAutomaticParser.SILENT, 0); }
		public ClearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clear; }
	}

	public final ClearContext clear() throws RecognitionException {
		ClearContext _localctx = new ClearContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_clear);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(CLEAR);
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SILENT) {
				{
				setState(603);
				match(SILENT);
				}
			}

			setState(606);
			graphRefAll();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SparqlAutomaticParser.DROP, 0); }
		public GraphRefAllContext graphRefAll() {
			return getRuleContext(GraphRefAllContext.class,0);
		}
		public TerminalNode SILENT() { return getToken(SparqlAutomaticParser.SILENT, 0); }
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_drop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(DROP);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SILENT) {
				{
				setState(609);
				match(SILENT);
				}
			}

			setState(612);
			graphRefAll();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SparqlAutomaticParser.CREATE, 0); }
		public GraphRefContext graphRef() {
			return getRuleContext(GraphRefContext.class,0);
		}
		public TerminalNode SILENT() { return getToken(SparqlAutomaticParser.SILENT, 0); }
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_create);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(CREATE);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SILENT) {
				{
				setState(615);
				match(SILENT);
				}
			}

			setState(618);
			graphRef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SparqlAutomaticParser.ADD, 0); }
		public List<GraphOrDefaultContext> graphOrDefault() {
			return getRuleContexts(GraphOrDefaultContext.class);
		}
		public GraphOrDefaultContext graphOrDefault(int i) {
			return getRuleContext(GraphOrDefaultContext.class,i);
		}
		public TerminalNode TO() { return getToken(SparqlAutomaticParser.TO, 0); }
		public TerminalNode SILENT() { return getToken(SparqlAutomaticParser.SILENT, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(ADD);
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SILENT) {
				{
				setState(621);
				match(SILENT);
				}
			}

			setState(624);
			graphOrDefault();
			setState(625);
			match(TO);
			setState(626);
			graphOrDefault();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MoveContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(SparqlAutomaticParser.MOVE, 0); }
		public List<GraphOrDefaultContext> graphOrDefault() {
			return getRuleContexts(GraphOrDefaultContext.class);
		}
		public GraphOrDefaultContext graphOrDefault(int i) {
			return getRuleContext(GraphOrDefaultContext.class,i);
		}
		public TerminalNode TO() { return getToken(SparqlAutomaticParser.TO, 0); }
		public TerminalNode SILENT() { return getToken(SparqlAutomaticParser.SILENT, 0); }
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(MOVE);
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SILENT) {
				{
				setState(629);
				match(SILENT);
				}
			}

			setState(632);
			graphOrDefault();
			setState(633);
			match(TO);
			setState(634);
			graphOrDefault();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CopyContext extends ParserRuleContext {
		public TerminalNode COPY() { return getToken(SparqlAutomaticParser.COPY, 0); }
		public List<GraphOrDefaultContext> graphOrDefault() {
			return getRuleContexts(GraphOrDefaultContext.class);
		}
		public GraphOrDefaultContext graphOrDefault(int i) {
			return getRuleContext(GraphOrDefaultContext.class,i);
		}
		public TerminalNode TO() { return getToken(SparqlAutomaticParser.TO, 0); }
		public TerminalNode SILENT() { return getToken(SparqlAutomaticParser.SILENT, 0); }
		public CopyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy; }
	}

	public final CopyContext copy() throws RecognitionException {
		CopyContext _localctx = new CopyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_copy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(COPY);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SILENT) {
				{
				setState(637);
				match(SILENT);
				}
			}

			setState(640);
			graphOrDefault();
			setState(641);
			match(TO);
			setState(642);
			graphOrDefault();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertDataContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SparqlAutomaticParser.INSERT, 0); }
		public TerminalNode DATA() { return getToken(SparqlAutomaticParser.DATA, 0); }
		public QuadDataContext quadData() {
			return getRuleContext(QuadDataContext.class,0);
		}
		public InsertDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertData; }
	}

	public final InsertDataContext insertData() throws RecognitionException {
		InsertDataContext _localctx = new InsertDataContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_insertData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(INSERT);
			setState(645);
			match(DATA);
			setState(646);
			quadData();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteDataContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SparqlAutomaticParser.DELETE, 0); }
		public TerminalNode DATA() { return getToken(SparqlAutomaticParser.DATA, 0); }
		public QuadDataContext quadData() {
			return getRuleContext(QuadDataContext.class,0);
		}
		public DeleteDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteData; }
	}

	public final DeleteDataContext deleteData() throws RecognitionException {
		DeleteDataContext _localctx = new DeleteDataContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_deleteData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(DELETE);
			setState(649);
			match(DATA);
			setState(650);
			quadData();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteWhereContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SparqlAutomaticParser.DELETE, 0); }
		public TerminalNode WHERE() { return getToken(SparqlAutomaticParser.WHERE, 0); }
		public QuadPatternContext quadPattern() {
			return getRuleContext(QuadPatternContext.class,0);
		}
		public DeleteWhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteWhere; }
	}

	public final DeleteWhereContext deleteWhere() throws RecognitionException {
		DeleteWhereContext _localctx = new DeleteWhereContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_deleteWhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(DELETE);
			setState(653);
			match(WHERE);
			setState(654);
			quadPattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifyContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SparqlAutomaticParser.WHERE, 0); }
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public DeleteClauseContext deleteClause() {
			return getRuleContext(DeleteClauseContext.class,0);
		}
		public InsertClauseContext insertClause() {
			return getRuleContext(InsertClauseContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SparqlAutomaticParser.WITH, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public List<UsingClauseContext> usingClause() {
			return getRuleContexts(UsingClauseContext.class);
		}
		public UsingClauseContext usingClause(int i) {
			return getRuleContext(UsingClauseContext.class,i);
		}
		public ModifyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modify; }
	}

	public final ModifyContext modify() throws RecognitionException {
		ModifyContext _localctx = new ModifyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_modify);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(656);
				match(WITH);
				setState(657);
				iri();
				}
			}

			setState(665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				{
				setState(660);
				deleteClause();
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(661);
					insertClause();
					}
				}

				}
				break;
			case INSERT:
				{
				setState(664);
				insertClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USING) {
				{
				{
				setState(667);
				usingClause();
				}
				}
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(673);
			match(WHERE);
			setState(674);
			groupGraphPattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteClauseContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SparqlAutomaticParser.DELETE, 0); }
		public QuadPatternContext quadPattern() {
			return getRuleContext(QuadPatternContext.class,0);
		}
		public DeleteClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteClause; }
	}

	public final DeleteClauseContext deleteClause() throws RecognitionException {
		DeleteClauseContext _localctx = new DeleteClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_deleteClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(DELETE);
			setState(677);
			quadPattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertClauseContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SparqlAutomaticParser.INSERT, 0); }
		public QuadPatternContext quadPattern() {
			return getRuleContext(QuadPatternContext.class,0);
		}
		public InsertClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertClause; }
	}

	public final InsertClauseContext insertClause() throws RecognitionException {
		InsertClauseContext _localctx = new InsertClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_insertClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(INSERT);
			setState(680);
			quadPattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsingClauseContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SparqlAutomaticParser.USING, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode NAMED() { return getToken(SparqlAutomaticParser.NAMED, 0); }
		public UsingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingClause; }
	}

	public final UsingClauseContext usingClause() throws RecognitionException {
		UsingClauseContext _localctx = new UsingClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_usingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(USING);
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case PREFIX_LANGTAG:
				{
				setState(683);
				iri();
				}
				break;
			case NAMED:
				{
				setState(684);
				match(NAMED);
				setState(685);
				iri();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GraphOrDefaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SparqlAutomaticParser.DEFAULT, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode GRAPH() { return getToken(SparqlAutomaticParser.GRAPH, 0); }
		public GraphOrDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphOrDefault; }
	}

	public final GraphOrDefaultContext graphOrDefault() throws RecognitionException {
		GraphOrDefaultContext _localctx = new GraphOrDefaultContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_graphOrDefault);
		int _la;
		try {
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				match(DEFAULT);
				}
				break;
			case GRAPH:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case PREFIX_LANGTAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRAPH) {
					{
					setState(689);
					match(GRAPH);
					}
				}

				setState(692);
				iri();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GraphRefContext extends ParserRuleContext {
		public TerminalNode GRAPH() { return getToken(SparqlAutomaticParser.GRAPH, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public GraphRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphRef; }
	}

	public final GraphRefContext graphRef() throws RecognitionException {
		GraphRefContext _localctx = new GraphRefContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_graphRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(GRAPH);
			setState(696);
			iri();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GraphRefAllContext extends ParserRuleContext {
		public GraphRefContext graphRef() {
			return getRuleContext(GraphRefContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SparqlAutomaticParser.DEFAULT, 0); }
		public TerminalNode NAMED() { return getToken(SparqlAutomaticParser.NAMED, 0); }
		public TerminalNode ALL() { return getToken(SparqlAutomaticParser.ALL, 0); }
		public GraphRefAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphRefAll; }
	}

	public final GraphRefAllContext graphRefAll() throws RecognitionException {
		GraphRefAllContext _localctx = new GraphRefAllContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_graphRefAll);
		try {
			setState(702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GRAPH:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				graphRef();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				match(DEFAULT);
				}
				break;
			case NAMED:
				enterOuterAlt(_localctx, 3);
				{
				setState(700);
				match(NAMED);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(701);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuadPatternContext extends ParserRuleContext {
		public QuadsContext quads() {
			return getRuleContext(QuadsContext.class,0);
		}
		public QuadPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quadPattern; }
	}

	public final QuadPatternContext quadPattern() throws RecognitionException {
		QuadPatternContext _localctx = new QuadPatternContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_quadPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(T__3);
			setState(705);
			quads();
			setState(706);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuadDataContext extends ParserRuleContext {
		public QuadsContext quads() {
			return getRuleContext(QuadsContext.class,0);
		}
		public QuadDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quadData; }
	}

	public final QuadDataContext quadData() throws RecognitionException {
		QuadDataContext _localctx = new QuadDataContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_quadData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(T__3);
			setState(709);
			quads();
			setState(710);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuadsContext extends ParserRuleContext {
		public List<TriplesTemplateContext> triplesTemplate() {
			return getRuleContexts(TriplesTemplateContext.class);
		}
		public TriplesTemplateContext triplesTemplate(int i) {
			return getRuleContext(TriplesTemplateContext.class,i);
		}
		public List<QuadsNotTriplesContext> quadsNotTriples() {
			return getRuleContexts(QuadsNotTriplesContext.class);
		}
		public QuadsNotTriplesContext quadsNotTriples(int i) {
			return getRuleContext(QuadsNotTriplesContext.class,i);
		}
		public QuadsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quads; }
	}

	public final QuadsContext quads() throws RecognitionException {
		QuadsContext _localctx = new QuadsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_quads);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 805371908L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 29228991L) != 0)) {
				{
				setState(712);
				triplesTemplate();
				}
			}

			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GRAPH) {
				{
				{
				setState(715);
				quadsNotTriples();
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(716);
					match(T__6);
					}
				}

				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 805371908L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 29228991L) != 0)) {
					{
					setState(719);
					triplesTemplate();
					}
				}

				}
				}
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuadsNotTriplesContext extends ParserRuleContext {
		public TerminalNode GRAPH() { return getToken(SparqlAutomaticParser.GRAPH, 0); }
		public VarOrIriContext varOrIri() {
			return getRuleContext(VarOrIriContext.class,0);
		}
		public TriplesTemplateContext triplesTemplate() {
			return getRuleContext(TriplesTemplateContext.class,0);
		}
		public QuadsNotTriplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quadsNotTriples; }
	}

	public final QuadsNotTriplesContext quadsNotTriples() throws RecognitionException {
		QuadsNotTriplesContext _localctx = new QuadsNotTriplesContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_quadsNotTriples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(GRAPH);
			setState(728);
			varOrIri();
			setState(729);
			match(T__3);
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 805371908L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 29228991L) != 0)) {
				{
				setState(730);
				triplesTemplate();
				}
			}

			setState(733);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriplesTemplateContext extends ParserRuleContext {
		public List<TriplesSameSubjectContext> triplesSameSubject() {
			return getRuleContexts(TriplesSameSubjectContext.class);
		}
		public TriplesSameSubjectContext triplesSameSubject(int i) {
			return getRuleContext(TriplesSameSubjectContext.class,i);
		}
		public TriplesTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesTemplate; }
	}

	public final TriplesTemplateContext triplesTemplate() throws RecognitionException {
		TriplesTemplateContext _localctx = new TriplesTemplateContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_triplesTemplate);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			triplesSameSubject();
			setState(740);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(736);
					match(T__6);
					setState(737);
					triplesSameSubject();
					}
					} 
				}
				setState(742);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(743);
				match(T__6);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupGraphPatternContext extends ParserRuleContext {
		public SubSelectContext subSelect() {
			return getRuleContext(SubSelectContext.class,0);
		}
		public GroupGraphPatternSubContext groupGraphPatternSub() {
			return getRuleContext(GroupGraphPatternSubContext.class,0);
		}
		public GroupGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupGraphPattern; }
	}

	public final GroupGraphPatternContext groupGraphPattern() throws RecognitionException {
		GroupGraphPatternContext _localctx = new GroupGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_groupGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(T__3);
			setState(749);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(747);
				subSelect();
				}
				break;
			case T__1:
			case T__3:
			case T__4:
			case T__15:
			case T__27:
			case T__28:
			case VALUES:
			case GRAPH:
			case OPTIONAL:
			case SERVICE:
			case BIND:
			case MINUS:
			case FILTER:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR1:
			case VAR2:
			case PREFIX_LANGTAG:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case NIL:
			case ANON:
				{
				setState(748);
				groupGraphPatternSub();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(751);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupGraphPatternSubContext extends ParserRuleContext {
		public TriplesBlockContext triplesBlock() {
			return getRuleContext(TriplesBlockContext.class,0);
		}
		public List<GraphPatternNotTriplesAndMaybeTriplesContext> graphPatternNotTriplesAndMaybeTriples() {
			return getRuleContexts(GraphPatternNotTriplesAndMaybeTriplesContext.class);
		}
		public GraphPatternNotTriplesAndMaybeTriplesContext graphPatternNotTriplesAndMaybeTriples(int i) {
			return getRuleContext(GraphPatternNotTriplesAndMaybeTriplesContext.class,i);
		}
		public GroupGraphPatternSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupGraphPatternSub; }
	}

	public final GroupGraphPatternSubContext groupGraphPatternSub() throws RecognitionException {
		GroupGraphPatternSubContext _localctx = new GroupGraphPatternSubContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_groupGraphPatternSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 805371908L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 29228991L) != 0)) {
				{
				setState(753);
				triplesBlock();
				}
			}

			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==VALUES || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 349L) != 0)) {
				{
				{
				setState(756);
				graphPatternNotTriplesAndMaybeTriples();
				}
				}
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GraphPatternNotTriplesAndMaybeTriplesContext extends ParserRuleContext {
		public GraphPatternNotTriplesContext graphPatternNotTriples() {
			return getRuleContext(GraphPatternNotTriplesContext.class,0);
		}
		public TriplesBlockContext triplesBlock() {
			return getRuleContext(TriplesBlockContext.class,0);
		}
		public GraphPatternNotTriplesAndMaybeTriplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphPatternNotTriplesAndMaybeTriples; }
	}

	public final GraphPatternNotTriplesAndMaybeTriplesContext graphPatternNotTriplesAndMaybeTriples() throws RecognitionException {
		GraphPatternNotTriplesAndMaybeTriplesContext _localctx = new GraphPatternNotTriplesAndMaybeTriplesContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_graphPatternNotTriplesAndMaybeTriples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			graphPatternNotTriples();
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(763);
				match(T__6);
				}
			}

			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 805371908L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 29228991L) != 0)) {
				{
				setState(766);
				triplesBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriplesBlockContext extends ParserRuleContext {
		public TriplesSameSubjectPathContext triplesSameSubjectPath() {
			return getRuleContext(TriplesSameSubjectPathContext.class,0);
		}
		public TriplesBlockContext triplesBlock() {
			return getRuleContext(TriplesBlockContext.class,0);
		}
		public TriplesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesBlock; }
	}

	public final TriplesBlockContext triplesBlock() throws RecognitionException {
		TriplesBlockContext _localctx = new TriplesBlockContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_triplesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			triplesSameSubjectPath();
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(770);
				match(T__6);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 805371908L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 29228991L) != 0)) {
					{
					setState(771);
					triplesBlock();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GraphPatternNotTriplesContext extends ParserRuleContext {
		public GroupOrUnionGraphPatternContext groupOrUnionGraphPattern() {
			return getRuleContext(GroupOrUnionGraphPatternContext.class,0);
		}
		public OptionalGraphPatternContext optionalGraphPattern() {
			return getRuleContext(OptionalGraphPatternContext.class,0);
		}
		public MinusGraphPatternContext minusGraphPattern() {
			return getRuleContext(MinusGraphPatternContext.class,0);
		}
		public GraphGraphPatternContext graphGraphPattern() {
			return getRuleContext(GraphGraphPatternContext.class,0);
		}
		public ServiceGraphPatternContext serviceGraphPattern() {
			return getRuleContext(ServiceGraphPatternContext.class,0);
		}
		public FilterRContext filterR() {
			return getRuleContext(FilterRContext.class,0);
		}
		public BindContext bind() {
			return getRuleContext(BindContext.class,0);
		}
		public InlineDataContext inlineData() {
			return getRuleContext(InlineDataContext.class,0);
		}
		public GraphPatternNotTriplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphPatternNotTriples; }
	}

	public final GraphPatternNotTriplesContext graphPatternNotTriples() throws RecognitionException {
		GraphPatternNotTriplesContext _localctx = new GraphPatternNotTriplesContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_graphPatternNotTriples);
		try {
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				groupOrUnionGraphPattern();
				}
				break;
			case OPTIONAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				optionalGraphPattern();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(778);
				minusGraphPattern();
				}
				break;
			case GRAPH:
				enterOuterAlt(_localctx, 4);
				{
				setState(779);
				graphGraphPattern();
				}
				break;
			case SERVICE:
				enterOuterAlt(_localctx, 5);
				{
				setState(780);
				serviceGraphPattern();
				}
				break;
			case FILTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(781);
				filterR();
				}
				break;
			case BIND:
				enterOuterAlt(_localctx, 7);
				{
				setState(782);
				bind();
				}
				break;
			case VALUES:
				enterOuterAlt(_localctx, 8);
				{
				setState(783);
				inlineData();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptionalGraphPatternContext extends ParserRuleContext {
		public TerminalNode OPTIONAL() { return getToken(SparqlAutomaticParser.OPTIONAL, 0); }
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public OptionalGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalGraphPattern; }
	}

	public final OptionalGraphPatternContext optionalGraphPattern() throws RecognitionException {
		OptionalGraphPatternContext _localctx = new OptionalGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_optionalGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(OPTIONAL);
			setState(787);
			groupGraphPattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GraphGraphPatternContext extends ParserRuleContext {
		public TerminalNode GRAPH() { return getToken(SparqlAutomaticParser.GRAPH, 0); }
		public VarOrIriContext varOrIri() {
			return getRuleContext(VarOrIriContext.class,0);
		}
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public GraphGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphGraphPattern; }
	}

	public final GraphGraphPatternContext graphGraphPattern() throws RecognitionException {
		GraphGraphPatternContext _localctx = new GraphGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_graphGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(GRAPH);
			setState(790);
			varOrIri();
			setState(791);
			groupGraphPattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ServiceGraphPatternContext extends ParserRuleContext {
		public TerminalNode SERVICE() { return getToken(SparqlAutomaticParser.SERVICE, 0); }
		public VarOrIriContext varOrIri() {
			return getRuleContext(VarOrIriContext.class,0);
		}
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public TerminalNode SILENT() { return getToken(SparqlAutomaticParser.SILENT, 0); }
		public ServiceGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceGraphPattern; }
	}

	public final ServiceGraphPatternContext serviceGraphPattern() throws RecognitionException {
		ServiceGraphPatternContext _localctx = new ServiceGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_serviceGraphPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(SERVICE);
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SILENT) {
				{
				setState(794);
				match(SILENT);
				}
			}

			setState(797);
			varOrIri();
			setState(798);
			groupGraphPattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BindContext extends ParserRuleContext {
		public TerminalNode BIND() { return getToken(SparqlAutomaticParser.BIND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparqlAutomaticParser.AS, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public BindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bind; }
	}

	public final BindContext bind() throws RecognitionException {
		BindContext _localctx = new BindContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_bind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(BIND);
			setState(801);
			match(T__1);
			setState(802);
			expression();
			setState(803);
			match(AS);
			setState(804);
			var();
			setState(805);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlineDataContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SparqlAutomaticParser.VALUES, 0); }
		public DataBlockContext dataBlock() {
			return getRuleContext(DataBlockContext.class,0);
		}
		public InlineDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineData; }
	}

	public final InlineDataContext inlineData() throws RecognitionException {
		InlineDataContext _localctx = new InlineDataContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_inlineData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(VALUES);
			setState(808);
			dataBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataBlockContext extends ParserRuleContext {
		public InlineDataOneVarContext inlineDataOneVar() {
			return getRuleContext(InlineDataOneVarContext.class,0);
		}
		public InlineDataFullContext inlineDataFull() {
			return getRuleContext(InlineDataFullContext.class,0);
		}
		public DataBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataBlock; }
	}

	public final DataBlockContext dataBlock() throws RecognitionException {
		DataBlockContext _localctx = new DataBlockContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_dataBlock);
		try {
			setState(812);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				inlineDataOneVar();
				}
				break;
			case T__1:
			case NIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				inlineDataFull();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlineDataOneVarContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<DataBlockValueContext> dataBlockValue() {
			return getRuleContexts(DataBlockValueContext.class);
		}
		public DataBlockValueContext dataBlockValue(int i) {
			return getRuleContext(DataBlockValueContext.class,i);
		}
		public InlineDataOneVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineDataOneVar; }
	}

	public final InlineDataOneVarContext inlineDataOneVar() throws RecognitionException {
		InlineDataOneVarContext _localctx = new InlineDataOneVarContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_inlineDataOneVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			var();
			setState(815);
			match(T__3);
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 70368744177667L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 4063111L) != 0)) {
				{
				{
				setState(816);
				dataBlockValue();
				}
				}
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(822);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlineDataFullContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(SparqlAutomaticParser.NIL, 0); }
		public List<DataBlockSingleContext> dataBlockSingle() {
			return getRuleContexts(DataBlockSingleContext.class);
		}
		public DataBlockSingleContext dataBlockSingle(int i) {
			return getRuleContext(DataBlockSingleContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public InlineDataFullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineDataFull; }
	}

	public final InlineDataFullContext inlineDataFull() throws RecognitionException {
		InlineDataFullContext _localctx = new InlineDataFullContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_inlineDataFull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL:
				{
				setState(824);
				match(NIL);
				}
				break;
			case T__1:
				{
				setState(825);
				match(T__1);
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR1 || _la==VAR2) {
					{
					{
					setState(826);
					var();
					}
					}
					setState(831);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(832);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(835);
			match(T__3);
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==NIL) {
				{
				{
				setState(836);
				dataBlockSingle();
				}
				}
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(842);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataBlockSingleContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(SparqlAutomaticParser.NIL, 0); }
		public List<DataBlockValueContext> dataBlockValue() {
			return getRuleContexts(DataBlockValueContext.class);
		}
		public DataBlockValueContext dataBlockValue(int i) {
			return getRuleContext(DataBlockValueContext.class,i);
		}
		public DataBlockSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataBlockSingle; }
	}

	public final DataBlockSingleContext dataBlockSingle() throws RecognitionException {
		DataBlockSingleContext _localctx = new DataBlockSingleContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_dataBlockSingle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(844);
				match(T__1);
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 70368744177667L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 4063111L) != 0)) {
					{
					{
					setState(845);
					dataBlockValue();
					}
					}
					setState(850);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(851);
				match(T__2);
				}
				break;
			case NIL:
				{
				setState(852);
				match(NIL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataBlockValueContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public RdfLiteralContext rdfLiteral() {
			return getRuleContext(RdfLiteralContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode UNDEF() { return getToken(SparqlAutomaticParser.UNDEF, 0); }
		public DataBlockValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataBlockValue; }
	}

	public final DataBlockValueContext dataBlockValue() throws RecognitionException {
		DataBlockValueContext _localctx = new DataBlockValueContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_dataBlockValue);
		try {
			setState(860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case PREFIX_LANGTAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				iri();
				}
				break;
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				rdfLiteral();
				}
				break;
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(857);
				numericLiteral();
				}
				break;
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(858);
				booleanLiteral();
				}
				break;
			case UNDEF:
				enterOuterAlt(_localctx, 5);
				{
				setState(859);
				match(UNDEF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MinusGraphPatternContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SparqlAutomaticParser.MINUS, 0); }
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public MinusGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusGraphPattern; }
	}

	public final MinusGraphPatternContext minusGraphPattern() throws RecognitionException {
		MinusGraphPatternContext _localctx = new MinusGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_minusGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(MINUS);
			setState(863);
			groupGraphPattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupOrUnionGraphPatternContext extends ParserRuleContext {
		public List<GroupGraphPatternContext> groupGraphPattern() {
			return getRuleContexts(GroupGraphPatternContext.class);
		}
		public GroupGraphPatternContext groupGraphPattern(int i) {
			return getRuleContext(GroupGraphPatternContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(SparqlAutomaticParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(SparqlAutomaticParser.UNION, i);
		}
		public GroupOrUnionGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupOrUnionGraphPattern; }
	}

	public final GroupOrUnionGraphPatternContext groupOrUnionGraphPattern() throws RecognitionException {
		GroupOrUnionGraphPatternContext _localctx = new GroupOrUnionGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_groupOrUnionGraphPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			groupGraphPattern();
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(866);
				match(UNION);
				setState(867);
				groupGraphPattern();
				}
				}
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilterRContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(SparqlAutomaticParser.FILTER, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public FilterRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterR; }
	}

	public final FilterRContext filterR() throws RecognitionException {
		FilterRContext _localctx = new FilterRContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_filterR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			match(FILTER);
			setState(874);
			constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintContext extends ParserRuleContext {
		public BrackettedExpressionContext brackettedExpression() {
			return getRuleContext(BrackettedExpressionContext.class,0);
		}
		public BuiltInCallContext builtInCall() {
			return getRuleContext(BuiltInCallContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_constraint);
		try {
			setState(879);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				brackettedExpression();
				}
				break;
			case GROUP_CONCAT:
			case NOT:
			case STR:
			case LANG:
			case LANGMATCHES:
			case DATATYPE:
			case BOUND:
			case IRI:
			case URI:
			case BNODE:
			case RAND:
			case ABS:
			case CEIL:
			case FLOOR:
			case ROUND:
			case CONCAT:
			case STRLEN:
			case UCASE:
			case LCASE:
			case ENCODE_FOR_URI:
			case CONTAINS:
			case STRSTARTS:
			case STRENDS:
			case STRBEFORE:
			case STRAFTER:
			case YEAR:
			case MONTH:
			case DAY:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case TIMEZONE:
			case TZ:
			case NOW:
			case UUID:
			case STRUUID:
			case SHA1:
			case SHA256:
			case SHA384:
			case SHA512:
			case MD5:
			case COALESCE:
			case IF:
			case STRLANG:
			case STRDT:
			case SAMETERM:
			case ISIRI:
			case ISURI:
			case ISBLANK:
			case ISLITERAL:
			case ISNUMERIC:
			case REGEX:
			case SUBSTR:
			case REPLACE:
			case EXISTS:
			case COUNT:
			case SUM:
			case MIN:
			case MAX:
			case AVG:
			case STDEV:
			case SAMPLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				builtInCall();
				}
				break;
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case PREFIX_LANGTAG:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				functionCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			iri();
			setState(882);
			argList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(SparqlAutomaticParser.NIL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DISTINCT() { return getToken(SparqlAutomaticParser.DISTINCT, 0); }
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_argList);
		int _la;
		try {
			setState(899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				match(NIL);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				match(T__1);
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(886);
					match(DISTINCT);
					}
				}

				setState(889);
				expression();
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(890);
					match(T__7);
					setState(891);
					expression();
					}
					}
					setState(896);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(897);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(SparqlAutomaticParser.NIL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_expressionList);
		int _la;
		try {
			setState(913);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL:
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				match(NIL);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(902);
				match(T__1);
				setState(903);
				expression();
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(904);
					match(T__7);
					setState(905);
					expression();
					}
					}
					setState(910);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(911);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructTemplateContext extends ParserRuleContext {
		public ConstructTriplesContext constructTriples() {
			return getRuleContext(ConstructTriplesContext.class,0);
		}
		public ConstructTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructTemplate; }
	}

	public final ConstructTemplateContext constructTemplate() throws RecognitionException {
		ConstructTemplateContext _localctx = new ConstructTemplateContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_constructTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(T__3);
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 805371908L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 29228991L) != 0)) {
				{
				setState(916);
				constructTriples();
				}
			}

			setState(919);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructTriplesContext extends ParserRuleContext {
		public TriplesSameSubjectContext triplesSameSubject() {
			return getRuleContext(TriplesSameSubjectContext.class,0);
		}
		public ConstructTriplesContext constructTriples() {
			return getRuleContext(ConstructTriplesContext.class,0);
		}
		public ConstructTriplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructTriples; }
	}

	public final ConstructTriplesContext constructTriples() throws RecognitionException {
		ConstructTriplesContext _localctx = new ConstructTriplesContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_constructTriples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			triplesSameSubject();
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(922);
				match(T__6);
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 805371908L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 29228991L) != 0)) {
					{
					setState(923);
					constructTriples();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriplesSameSubjectContext extends ParserRuleContext {
		public VarOrTermContext varOrTerm() {
			return getRuleContext(VarOrTermContext.class,0);
		}
		public PropertyListNotEmptyContext propertyListNotEmpty() {
			return getRuleContext(PropertyListNotEmptyContext.class,0);
		}
		public TriplesNodeContext triplesNode() {
			return getRuleContext(TriplesNodeContext.class,0);
		}
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TriplesSameSubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesSameSubject; }
	}

	public final TriplesSameSubjectContext triplesSameSubject() throws RecognitionException {
		TriplesSameSubjectContext _localctx = new TriplesSameSubjectContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_triplesSameSubject);
		try {
			setState(934);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR1:
			case VAR2:
			case PREFIX_LANGTAG:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case NIL:
			case ANON:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				varOrTerm();
				setState(929);
				propertyListNotEmpty();
				}
				break;
			case T__1:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
				triplesNode();
				setState(932);
				propertyList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyListContext extends ParserRuleContext {
		public PropertyListNotEmptyContext propertyListNotEmpty() {
			return getRuleContext(PropertyListNotEmptyContext.class,0);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 183L) != 0)) {
				{
				setState(936);
				propertyListNotEmpty();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyListNotEmptyContext extends ParserRuleContext {
		public List<VerbContext> verb() {
			return getRuleContexts(VerbContext.class);
		}
		public VerbContext verb(int i) {
			return getRuleContext(VerbContext.class,i);
		}
		public List<ObjectListContext> objectList() {
			return getRuleContexts(ObjectListContext.class);
		}
		public ObjectListContext objectList(int i) {
			return getRuleContext(ObjectListContext.class,i);
		}
		public PropertyListNotEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyListNotEmpty; }
	}

	public final PropertyListNotEmptyContext propertyListNotEmpty() throws RecognitionException {
		PropertyListNotEmptyContext _localctx = new PropertyListNotEmptyContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_propertyListNotEmpty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			verb();
			setState(940);
			objectList();
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(941);
				match(T__5);
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8 || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 183L) != 0)) {
					{
					setState(942);
					verb();
					setState(943);
					objectList();
					}
				}

				}
				}
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VerbContext extends ParserRuleContext {
		public VarOrIriContext varOrIri() {
			return getRuleContext(VarOrIriContext.class,0);
		}
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_verb);
		try {
			setState(954);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR1:
			case VAR2:
			case PREFIX_LANGTAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(952);
				varOrIri();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(953);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectListContext extends ParserRuleContext {
		public List<ObjectRContext> objectR() {
			return getRuleContexts(ObjectRContext.class);
		}
		public ObjectRContext objectR(int i) {
			return getRuleContext(ObjectRContext.class,i);
		}
		public ObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectList; }
	}

	public final ObjectListContext objectList() throws RecognitionException {
		ObjectListContext _localctx = new ObjectListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_objectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			objectR();
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(957);
				match(T__7);
				setState(958);
				objectR();
				}
				}
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectRContext extends ParserRuleContext {
		public GraphNodeContext graphNode() {
			return getRuleContext(GraphNodeContext.class,0);
		}
		public ObjectRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectR; }
	}

	public final ObjectRContext objectR() throws RecognitionException {
		ObjectRContext _localctx = new ObjectRContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_objectR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			graphNode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriplesSameSubjectPathContext extends ParserRuleContext {
		public VarOrTermContext varOrTerm() {
			return getRuleContext(VarOrTermContext.class,0);
		}
		public PropertyListPathNotEmptyContext propertyListPathNotEmpty() {
			return getRuleContext(PropertyListPathNotEmptyContext.class,0);
		}
		public TriplesNodePathContext triplesNodePath() {
			return getRuleContext(TriplesNodePathContext.class,0);
		}
		public PropertyListPathContext propertyListPath() {
			return getRuleContext(PropertyListPathContext.class,0);
		}
		public TriplesSameSubjectPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesSameSubjectPath; }
	}

	public final TriplesSameSubjectPathContext triplesSameSubjectPath() throws RecognitionException {
		TriplesSameSubjectPathContext _localctx = new TriplesSameSubjectPathContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_triplesSameSubjectPath);
		try {
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR1:
			case VAR2:
			case PREFIX_LANGTAG:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case NIL:
			case ANON:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				varOrTerm();
				setState(967);
				propertyListPathNotEmpty();
				}
				break;
			case T__1:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				triplesNodePath();
				setState(970);
				propertyListPath();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyListPathContext extends ParserRuleContext {
		public PropertyListPathNotEmptyContext propertyListPathNotEmpty() {
			return getRuleContext(PropertyListPathNotEmptyContext.class,0);
		}
		public PropertyListPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyListPath; }
	}

	public final PropertyListPathContext propertyListPath() throws RecognitionException {
		PropertyListPathContext _localctx = new PropertyListPathContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_propertyListPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37380L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 183L) != 0)) {
				{
				setState(974);
				propertyListPathNotEmpty();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyListPathNotEmptyContext extends ParserRuleContext {
		public TupleWithPathContext tupleWithPath() {
			return getRuleContext(TupleWithPathContext.class,0);
		}
		public List<TupleWithoutPathContext> tupleWithoutPath() {
			return getRuleContexts(TupleWithoutPathContext.class);
		}
		public TupleWithoutPathContext tupleWithoutPath(int i) {
			return getRuleContext(TupleWithoutPathContext.class,i);
		}
		public PropertyListPathNotEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyListPathNotEmpty; }
	}

	public final PropertyListPathNotEmptyContext propertyListPathNotEmpty() throws RecognitionException {
		PropertyListPathNotEmptyContext _localctx = new PropertyListPathNotEmptyContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_propertyListPathNotEmpty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			tupleWithPath();
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(978);
				match(T__5);
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37380L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 183L) != 0)) {
					{
					setState(979);
					tupleWithoutPath();
					}
				}

				}
				}
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VerbPathContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public VerbPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbPath; }
	}

	public final VerbPathContext verbPath() throws RecognitionException {
		VerbPathContext _localctx = new VerbPathContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_verbPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VerbSimpleContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VerbSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbSimple; }
	}

	public final VerbSimpleContext verbSimple() throws RecognitionException {
		VerbSimpleContext _localctx = new VerbSimpleContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_verbSimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TupleWithoutPathContext extends ParserRuleContext {
		public VerbPathOrSimpleContext verbPathOrSimple() {
			return getRuleContext(VerbPathOrSimpleContext.class,0);
		}
		public ObjectListContext objectList() {
			return getRuleContext(ObjectListContext.class,0);
		}
		public TupleWithoutPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleWithoutPath; }
	}

	public final TupleWithoutPathContext tupleWithoutPath() throws RecognitionException {
		TupleWithoutPathContext _localctx = new TupleWithoutPathContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_tupleWithoutPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			verbPathOrSimple();
			setState(992);
			objectList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TupleWithPathContext extends ParserRuleContext {
		public VerbPathOrSimpleContext verbPathOrSimple() {
			return getRuleContext(VerbPathOrSimpleContext.class,0);
		}
		public ObjectListPathContext objectListPath() {
			return getRuleContext(ObjectListPathContext.class,0);
		}
		public TupleWithPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleWithPath; }
	}

	public final TupleWithPathContext tupleWithPath() throws RecognitionException {
		TupleWithPathContext _localctx = new TupleWithPathContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_tupleWithPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			verbPathOrSimple();
			setState(995);
			objectListPath();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VerbPathOrSimpleContext extends ParserRuleContext {
		public VerbPathContext verbPath() {
			return getRuleContext(VerbPathContext.class,0);
		}
		public VerbSimpleContext verbSimple() {
			return getRuleContext(VerbSimpleContext.class,0);
		}
		public VerbPathOrSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbPathOrSimple; }
	}

	public final VerbPathOrSimpleContext verbPathOrSimple() throws RecognitionException {
		VerbPathOrSimpleContext _localctx = new VerbPathOrSimpleContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_verbPathOrSimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__8:
			case T__11:
			case T__14:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case PREFIX_LANGTAG:
				{
				setState(997);
				verbPath();
				}
				break;
			case VAR1:
			case VAR2:
				{
				setState(998);
				verbSimple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectListPathContext extends ParserRuleContext {
		public List<ObjectPathContext> objectPath() {
			return getRuleContexts(ObjectPathContext.class);
		}
		public ObjectPathContext objectPath(int i) {
			return getRuleContext(ObjectPathContext.class,i);
		}
		public ObjectListPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectListPath; }
	}

	public final ObjectListPathContext objectListPath() throws RecognitionException {
		ObjectListPathContext _localctx = new ObjectListPathContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_objectListPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			objectPath();
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(1002);
				match(T__7);
				setState(1003);
				objectPath();
				}
				}
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPathContext extends ParserRuleContext {
		public GraphNodePathContext graphNodePath() {
			return getRuleContext(GraphNodePathContext.class,0);
		}
		public ObjectPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPath; }
	}

	public final ObjectPathContext objectPath() throws RecognitionException {
		ObjectPathContext _localctx = new ObjectPathContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_objectPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			graphNodePath();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PathContext extends ParserRuleContext {
		public PathAlternativeContext pathAlternative() {
			return getRuleContext(PathAlternativeContext.class,0);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			pathAlternative();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PathAlternativeContext extends ParserRuleContext {
		public List<PathSequenceContext> pathSequence() {
			return getRuleContexts(PathSequenceContext.class);
		}
		public PathSequenceContext pathSequence(int i) {
			return getRuleContext(PathSequenceContext.class,i);
		}
		public PathAlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathAlternative; }
	}

	public final PathAlternativeContext pathAlternative() throws RecognitionException {
		PathAlternativeContext _localctx = new PathAlternativeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_pathAlternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			pathSequence();
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(1014);
				match(T__9);
				setState(1015);
				pathSequence();
				}
				}
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PathSequenceContext extends ParserRuleContext {
		public List<PathEltOrInverseContext> pathEltOrInverse() {
			return getRuleContexts(PathEltOrInverseContext.class);
		}
		public PathEltOrInverseContext pathEltOrInverse(int i) {
			return getRuleContext(PathEltOrInverseContext.class,i);
		}
		public PathSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathSequence; }
	}

	public final PathSequenceContext pathSequence() throws RecognitionException {
		PathSequenceContext _localctx = new PathSequenceContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_pathSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			pathEltOrInverse();
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(1022);
				match(T__10);
				setState(1023);
				pathEltOrInverse();
				}
				}
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PathEltContext extends ParserRuleContext {
		public PathPrimaryContext pathPrimary() {
			return getRuleContext(PathPrimaryContext.class,0);
		}
		public PathModContext pathMod() {
			return getRuleContext(PathModContext.class,0);
		}
		public PathEltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathElt; }
	}

	public final PathEltContext pathElt() throws RecognitionException {
		PathEltContext _localctx = new PathEltContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_pathElt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			pathPrimary();
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 24594L) != 0)) {
				{
				setState(1030);
				pathMod();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PathEltOrInverseContext extends ParserRuleContext {
		public Token negationOperator;
		public PathEltContext pathElt() {
			return getRuleContext(PathEltContext.class,0);
		}
		public PathEltOrInverseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathEltOrInverse; }
	}

	public final PathEltOrInverseContext pathEltOrInverse() throws RecognitionException {
		PathEltOrInverseContext _localctx = new PathEltOrInverseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_pathEltOrInverse);
		try {
			setState(1036);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__8:
			case T__14:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case PREFIX_LANGTAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				pathElt();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034);
				((PathEltOrInverseContext)_localctx).negationOperator = match(T__11);
				setState(1035);
				pathElt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PathModContext extends ParserRuleContext {
		public StepsMinContext stepsMin() {
			return getRuleContext(StepsMinContext.class,0);
		}
		public StepsMaxContext stepsMax() {
			return getRuleContext(StepsMaxContext.class,0);
		}
		public PathModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathMod; }
	}

	public final PathModContext pathMod() throws RecognitionException {
		PathModContext _localctx = new PathModContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_pathMod);
		int _la;
		try {
			setState(1051);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
				match(T__12);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				match(T__0);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(1040);
				match(T__13);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(1041);
				match(T__3);
				setState(1042);
				stepsMin();
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1043);
					match(T__7);
					setState(1045);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INTEGER) {
						{
						setState(1044);
						stepsMax();
						}
					}

					}
				}

				setState(1049);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StepsMinContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public StepsMinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepsMin; }
	}

	public final StepsMinContext stepsMin() throws RecognitionException {
		StepsMinContext _localctx = new StepsMinContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_stepsMin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StepsMaxContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public StepsMaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepsMax; }
	}

	public final StepsMaxContext stepsMax() throws RecognitionException {
		StepsMaxContext _localctx = new StepsMaxContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_stepsMax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PathPrimaryContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public PathNegatedPropertySetContext pathNegatedPropertySet() {
			return getRuleContext(PathNegatedPropertySetContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public PathPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathPrimary; }
	}

	public final PathPrimaryContext pathPrimary() throws RecognitionException {
		PathPrimaryContext _localctx = new PathPrimaryContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_pathPrimary);
		try {
			setState(1065);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case PREFIX_LANGTAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057);
				iri();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				match(T__8);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(1059);
				match(T__14);
				setState(1060);
				pathNegatedPropertySet();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(1061);
				match(T__1);
				setState(1062);
				path();
				setState(1063);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PathNegatedPropertySetContext extends ParserRuleContext {
		public List<PathOneInPropertySetContext> pathOneInPropertySet() {
			return getRuleContexts(PathOneInPropertySetContext.class);
		}
		public PathOneInPropertySetContext pathOneInPropertySet(int i) {
			return getRuleContext(PathOneInPropertySetContext.class,i);
		}
		public PathNegatedPropertySetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathNegatedPropertySet; }
	}

	public final PathNegatedPropertySetContext pathNegatedPropertySet() throws RecognitionException {
		PathNegatedPropertySetContext _localctx = new PathNegatedPropertySetContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_pathNegatedPropertySet);
		int _la;
		try {
			setState(1080);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__11:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case PREFIX_LANGTAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(1067);
				pathOneInPropertySet();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(1068);
				match(T__1);
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8 || _la==T__11 || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 135L) != 0)) {
					{
					setState(1069);
					pathOneInPropertySet();
					setState(1074);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(1070);
						match(T__9);
						setState(1071);
						pathOneInPropertySet();
						}
						}
						setState(1076);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1079);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PathOneInPropertySetContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public PathOneInPropertySetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathOneInPropertySet; }
	}

	public final PathOneInPropertySetContext pathOneInPropertySet() throws RecognitionException {
		PathOneInPropertySetContext _localctx = new PathOneInPropertySetContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_pathOneInPropertySet);
		try {
			setState(1089);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case PREFIX_LANGTAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				iri();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(1083);
				match(T__8);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(1084);
				match(T__11);
				setState(1087);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IRI_REF:
				case PNAME_NS:
				case PNAME_LN:
				case PREFIX_LANGTAG:
					{
					setState(1085);
					iri();
					}
					break;
				case T__8:
					{
					setState(1086);
					match(T__8);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SparqlAutomaticParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriplesNodeContext extends ParserRuleContext {
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public TriplesNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesNode; }
	}

	public final TriplesNodeContext triplesNode() throws RecognitionException {
		TriplesNodeContext _localctx = new TriplesNodeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_triplesNode);
		try {
			setState(1095);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1093);
				collection();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
				blankNodePropertyList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlankNodePropertyListContext extends ParserRuleContext {
		public PropertyListNotEmptyContext propertyListNotEmpty() {
			return getRuleContext(PropertyListNotEmptyContext.class,0);
		}
		public BlankNodePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNodePropertyList; }
	}

	public final BlankNodePropertyListContext blankNodePropertyList() throws RecognitionException {
		BlankNodePropertyListContext _localctx = new BlankNodePropertyListContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_blankNodePropertyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			match(T__15);
			setState(1098);
			propertyListNotEmpty();
			setState(1099);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriplesNodePathContext extends ParserRuleContext {
		public CollectionPathContext collectionPath() {
			return getRuleContext(CollectionPathContext.class,0);
		}
		public BlankNodePropertyListPathContext blankNodePropertyListPath() {
			return getRuleContext(BlankNodePropertyListPathContext.class,0);
		}
		public TriplesNodePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesNodePath; }
	}

	public final TriplesNodePathContext triplesNodePath() throws RecognitionException {
		TriplesNodePathContext _localctx = new TriplesNodePathContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_triplesNodePath);
		try {
			setState(1103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				collectionPath();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
				blankNodePropertyListPath();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlankNodePropertyListPathContext extends ParserRuleContext {
		public PropertyListPathNotEmptyContext propertyListPathNotEmpty() {
			return getRuleContext(PropertyListPathNotEmptyContext.class,0);
		}
		public BlankNodePropertyListPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNodePropertyListPath; }
	}

	public final BlankNodePropertyListPathContext blankNodePropertyListPath() throws RecognitionException {
		BlankNodePropertyListPathContext _localctx = new BlankNodePropertyListPathContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_blankNodePropertyListPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			match(T__15);
			setState(1106);
			propertyListPathNotEmpty();
			setState(1107);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CollectionContext extends ParserRuleContext {
		public List<GraphNodeContext> graphNode() {
			return getRuleContexts(GraphNodeContext.class);
		}
		public GraphNodeContext graphNode(int i) {
			return getRuleContext(GraphNodeContext.class,i);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(T__1);
			setState(1111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1110);
				graphNode();
				}
				}
				setState(1113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 805371908L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 29228991L) != 0) );
			setState(1115);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CollectionPathContext extends ParserRuleContext {
		public List<GraphNodePathContext> graphNodePath() {
			return getRuleContexts(GraphNodePathContext.class);
		}
		public GraphNodePathContext graphNodePath(int i) {
			return getRuleContext(GraphNodePathContext.class,i);
		}
		public CollectionPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionPath; }
	}

	public final CollectionPathContext collectionPath() throws RecognitionException {
		CollectionPathContext _localctx = new CollectionPathContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_collectionPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(T__1);
			setState(1119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1118);
				graphNodePath();
				}
				}
				setState(1121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 805371908L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 29228991L) != 0) );
			setState(1123);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GraphNodeContext extends ParserRuleContext {
		public VarOrTermContext varOrTerm() {
			return getRuleContext(VarOrTermContext.class,0);
		}
		public TriplesNodeContext triplesNode() {
			return getRuleContext(TriplesNodeContext.class,0);
		}
		public GraphNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphNode; }
	}

	public final GraphNodeContext graphNode() throws RecognitionException {
		GraphNodeContext _localctx = new GraphNodeContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_graphNode);
		try {
			setState(1127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR1:
			case VAR2:
			case PREFIX_LANGTAG:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case NIL:
			case ANON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				varOrTerm();
				}
				break;
			case T__1:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(1126);
				triplesNode();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GraphNodePathContext extends ParserRuleContext {
		public VarOrTermContext varOrTerm() {
			return getRuleContext(VarOrTermContext.class,0);
		}
		public TriplesNodePathContext triplesNodePath() {
			return getRuleContext(TriplesNodePathContext.class,0);
		}
		public GraphNodePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphNodePath; }
	}

	public final GraphNodePathContext graphNodePath() throws RecognitionException {
		GraphNodePathContext _localctx = new GraphNodePathContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_graphNodePath);
		try {
			setState(1131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR1:
			case VAR2:
			case PREFIX_LANGTAG:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case NIL:
			case ANON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1129);
				varOrTerm();
				}
				break;
			case T__1:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				triplesNodePath();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarOrTermContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public GraphTermContext graphTerm() {
			return getRuleContext(GraphTermContext.class,0);
		}
		public VarOrTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrTerm; }
	}

	public final VarOrTermContext varOrTerm() throws RecognitionException {
		VarOrTermContext _localctx = new VarOrTermContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_varOrTerm);
		try {
			setState(1135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 1);
				{
				setState(1133);
				var();
				}
				break;
			case T__27:
			case T__28:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case PREFIX_LANGTAG:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case NIL:
			case ANON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1134);
				graphTerm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarOrIriContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public VarOrIriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrIri; }
	}

	public final VarOrIriContext varOrIri() throws RecognitionException {
		VarOrIriContext _localctx = new VarOrIriContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_varOrIri);
		try {
			setState(1139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 1);
				{
				setState(1137);
				var();
				}
				break;
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case PREFIX_LANGTAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				iri();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR1() { return getToken(SparqlAutomaticParser.VAR1, 0); }
		public TerminalNode VAR2() { return getToken(SparqlAutomaticParser.VAR2, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			_la = _input.LA(1);
			if ( !(_la==VAR1 || _la==VAR2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GraphTermContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public RdfLiteralContext rdfLiteral() {
			return getRuleContext(RdfLiteralContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BlankNodeContext blankNode() {
			return getRuleContext(BlankNodeContext.class,0);
		}
		public TerminalNode NIL() { return getToken(SparqlAutomaticParser.NIL, 0); }
		public GraphTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphTerm; }
	}

	public final GraphTermContext graphTerm() throws RecognitionException {
		GraphTermContext _localctx = new GraphTermContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_graphTerm);
		try {
			setState(1149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case PREFIX_LANGTAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(1143);
				iri();
				}
				break;
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1144);
				rdfLiteral();
				}
				break;
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1145);
				numericLiteral();
				}
				break;
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(1146);
				booleanLiteral();
				}
				break;
			case BLANK_NODE_LABEL:
			case ANON:
				enterOuterAlt(_localctx, 5);
				{
				setState(1147);
				blankNode();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1148);
				match(NIL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			conditionalOrExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			conditionalAndExpression();
			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(1154);
				match(T__17);
				setState(1155);
				conditionalAndExpression();
				}
				}
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<ValueLogicalContext> valueLogical() {
			return getRuleContexts(ValueLogicalContext.class);
		}
		public ValueLogicalContext valueLogical(int i) {
			return getRuleContext(ValueLogicalContext.class,i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			valueLogical();
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(1162);
				match(T__18);
				setState(1163);
				valueLogical();
				}
				}
				setState(1168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueLogicalContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ValueLogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueLogical; }
	}

	public final ValueLogicalContext valueLogical() throws RecognitionException {
		ValueLogicalContext _localctx = new ValueLogicalContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_valueLogical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			relationalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public Token notToken;
		public List<NumericExpressionContext> numericExpression() {
			return getRuleContexts(NumericExpressionContext.class);
		}
		public NumericExpressionContext numericExpression(int i) {
			return getRuleContext(NumericExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SparqlAutomaticParser.IN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparqlAutomaticParser.NOT, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_relationalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			numericExpression();
			setState(1189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				{
				setState(1172);
				match(T__19);
				setState(1173);
				numericExpression();
				}
				break;
			case T__20:
				{
				setState(1174);
				match(T__20);
				setState(1175);
				numericExpression();
				}
				break;
			case T__21:
				{
				setState(1176);
				match(T__21);
				setState(1177);
				numericExpression();
				}
				break;
			case T__22:
				{
				setState(1178);
				match(T__22);
				setState(1179);
				numericExpression();
				}
				break;
			case T__23:
				{
				setState(1180);
				match(T__23);
				setState(1181);
				numericExpression();
				}
				break;
			case T__24:
				{
				setState(1182);
				match(T__24);
				setState(1183);
				numericExpression();
				}
				break;
			case IN:
				{
				setState(1184);
				match(IN);
				setState(1185);
				expressionList();
				}
				break;
			case NOT:
				{
				{
				setState(1186);
				((RelationalExpressionContext)_localctx).notToken = match(NOT);
				}
				setState(1187);
				match(IN);
				setState(1188);
				expressionList();
				}
				break;
			case T__2:
			case T__5:
			case T__7:
			case T__17:
			case T__18:
			case AS:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public NumericExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericExpression; }
	}

	public final NumericExpressionContext numericExpression() throws RecognitionException {
		NumericExpressionContext _localctx = new NumericExpressionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_numericExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			additiveExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public List<MultiplicativeExpressionWithSignContext> multiplicativeExpressionWithSign() {
			return getRuleContexts(MultiplicativeExpressionWithSignContext.class);
		}
		public MultiplicativeExpressionWithSignContext multiplicativeExpressionWithSign(int i) {
			return getRuleContext(MultiplicativeExpressionWithSignContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			multiplicativeExpression();
			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__25 || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 63L) != 0)) {
				{
				{
				setState(1194);
				multiplicativeExpressionWithSign();
				}
				}
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionWithSignContext extends ParserRuleContext {
		public PlusSubexpressionContext plusSubexpression() {
			return getRuleContext(PlusSubexpressionContext.class,0);
		}
		public MinusSubexpressionContext minusSubexpression() {
			return getRuleContext(MinusSubexpressionContext.class,0);
		}
		public MultiplicativeExpressionWithLeadingSignButNoSpaceContext multiplicativeExpressionWithLeadingSignButNoSpace() {
			return getRuleContext(MultiplicativeExpressionWithLeadingSignButNoSpaceContext.class,0);
		}
		public MultiplicativeExpressionWithSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpressionWithSign; }
	}

	public final MultiplicativeExpressionWithSignContext multiplicativeExpressionWithSign() throws RecognitionException {
		MultiplicativeExpressionWithSignContext _localctx = new MultiplicativeExpressionWithSignContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_multiplicativeExpressionWithSign);
		try {
			setState(1205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(1200);
				match(T__12);
				setState(1201);
				plusSubexpression();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(1202);
				match(T__25);
				setState(1203);
				minusSubexpression();
				}
				break;
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1204);
				multiplicativeExpressionWithLeadingSignButNoSpace();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlusSubexpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public PlusSubexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusSubexpression; }
	}

	public final PlusSubexpressionContext plusSubexpression() throws RecognitionException {
		PlusSubexpressionContext _localctx = new PlusSubexpressionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_plusSubexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			multiplicativeExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MinusSubexpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MinusSubexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusSubexpression; }
	}

	public final MinusSubexpressionContext minusSubexpression() throws RecognitionException {
		MinusSubexpressionContext _localctx = new MinusSubexpressionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_minusSubexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			multiplicativeExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionWithLeadingSignButNoSpaceContext extends ParserRuleContext {
		public NumericLiteralPositiveContext numericLiteralPositive() {
			return getRuleContext(NumericLiteralPositiveContext.class,0);
		}
		public NumericLiteralNegativeContext numericLiteralNegative() {
			return getRuleContext(NumericLiteralNegativeContext.class,0);
		}
		public List<MultiplyOrDivideExpressionContext> multiplyOrDivideExpression() {
			return getRuleContexts(MultiplyOrDivideExpressionContext.class);
		}
		public MultiplyOrDivideExpressionContext multiplyOrDivideExpression(int i) {
			return getRuleContext(MultiplyOrDivideExpressionContext.class,i);
		}
		public MultiplicativeExpressionWithLeadingSignButNoSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpressionWithLeadingSignButNoSpace; }
	}

	public final MultiplicativeExpressionWithLeadingSignButNoSpaceContext multiplicativeExpressionWithLeadingSignButNoSpace() throws RecognitionException {
		MultiplicativeExpressionWithLeadingSignButNoSpaceContext _localctx = new MultiplicativeExpressionWithLeadingSignButNoSpaceContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_multiplicativeExpressionWithLeadingSignButNoSpace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
				{
				setState(1211);
				numericLiteralPositive();
				}
				break;
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				{
				setState(1212);
				numericLiteralNegative();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__10) {
				{
				{
				setState(1215);
				multiplyOrDivideExpression();
				}
				}
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public List<MultiplyOrDivideExpressionContext> multiplyOrDivideExpression() {
			return getRuleContexts(MultiplyOrDivideExpressionContext.class);
		}
		public MultiplyOrDivideExpressionContext multiplyOrDivideExpression(int i) {
			return getRuleContext(MultiplyOrDivideExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			unaryExpression();
			setState(1225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__10) {
				{
				{
				setState(1222);
				multiplyOrDivideExpression();
				}
				}
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyOrDivideExpressionContext extends ParserRuleContext {
		public MultiplyExpressionContext multiplyExpression() {
			return getRuleContext(MultiplyExpressionContext.class,0);
		}
		public DivideExpressionContext divideExpression() {
			return getRuleContext(DivideExpressionContext.class,0);
		}
		public MultiplyOrDivideExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyOrDivideExpression; }
	}

	public final MultiplyOrDivideExpressionContext multiplyOrDivideExpression() throws RecognitionException {
		MultiplyOrDivideExpressionContext _localctx = new MultiplyOrDivideExpressionContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_multiplyOrDivideExpression);
		try {
			setState(1230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(1228);
				multiplyExpression();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(1229);
				divideExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExpression; }
	}

	public final MultiplyExpressionContext multiplyExpression() throws RecognitionException {
		MultiplyExpressionContext _localctx = new MultiplyExpressionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_multiplyExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			match(T__0);
			setState(1233);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivideExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public DivideExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divideExpression; }
	}

	public final DivideExpressionContext divideExpression() throws RecognitionException {
		DivideExpressionContext _localctx = new DivideExpressionContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_divideExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			match(T__10);
			setState(1236);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_unaryExpression);
		try {
			setState(1245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(1238);
				match(T__14);
				setState(1239);
				primaryExpression();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(1240);
				match(T__12);
				setState(1241);
				primaryExpression();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(1242);
				match(T__25);
				setState(1243);
				primaryExpression();
				}
				break;
			case T__1:
			case T__27:
			case T__28:
			case GROUP_CONCAT:
			case NOT:
			case STR:
			case LANG:
			case LANGMATCHES:
			case DATATYPE:
			case BOUND:
			case IRI:
			case URI:
			case BNODE:
			case RAND:
			case ABS:
			case CEIL:
			case FLOOR:
			case ROUND:
			case CONCAT:
			case STRLEN:
			case UCASE:
			case LCASE:
			case ENCODE_FOR_URI:
			case CONTAINS:
			case STRSTARTS:
			case STRENDS:
			case STRBEFORE:
			case STRAFTER:
			case YEAR:
			case MONTH:
			case DAY:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case TIMEZONE:
			case TZ:
			case NOW:
			case UUID:
			case STRUUID:
			case SHA1:
			case SHA256:
			case SHA384:
			case SHA512:
			case MD5:
			case COALESCE:
			case IF:
			case STRLANG:
			case STRDT:
			case SAMETERM:
			case ISIRI:
			case ISURI:
			case ISBLANK:
			case ISLITERAL:
			case ISNUMERIC:
			case REGEX:
			case SUBSTR:
			case REPLACE:
			case EXISTS:
			case COUNT:
			case SUM:
			case MIN:
			case MAX:
			case AVG:
			case STDEV:
			case SAMPLE:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR1:
			case VAR2:
			case PREFIX_LANGTAG:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 4);
				{
				setState(1244);
				primaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public BrackettedExpressionContext brackettedExpression() {
			return getRuleContext(BrackettedExpressionContext.class,0);
		}
		public BuiltInCallContext builtInCall() {
			return getRuleContext(BuiltInCallContext.class,0);
		}
		public IriOrFunctionContext iriOrFunction() {
			return getRuleContext(IriOrFunctionContext.class,0);
		}
		public RdfLiteralContext rdfLiteral() {
			return getRuleContext(RdfLiteralContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_primaryExpression);
		try {
			setState(1254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1247);
				brackettedExpression();
				}
				break;
			case GROUP_CONCAT:
			case NOT:
			case STR:
			case LANG:
			case LANGMATCHES:
			case DATATYPE:
			case BOUND:
			case IRI:
			case URI:
			case BNODE:
			case RAND:
			case ABS:
			case CEIL:
			case FLOOR:
			case ROUND:
			case CONCAT:
			case STRLEN:
			case UCASE:
			case LCASE:
			case ENCODE_FOR_URI:
			case CONTAINS:
			case STRSTARTS:
			case STRENDS:
			case STRBEFORE:
			case STRAFTER:
			case YEAR:
			case MONTH:
			case DAY:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case TIMEZONE:
			case TZ:
			case NOW:
			case UUID:
			case STRUUID:
			case SHA1:
			case SHA256:
			case SHA384:
			case SHA512:
			case MD5:
			case COALESCE:
			case IF:
			case STRLANG:
			case STRDT:
			case SAMETERM:
			case ISIRI:
			case ISURI:
			case ISBLANK:
			case ISLITERAL:
			case ISNUMERIC:
			case REGEX:
			case SUBSTR:
			case REPLACE:
			case EXISTS:
			case COUNT:
			case SUM:
			case MIN:
			case MAX:
			case AVG:
			case STDEV:
			case SAMPLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				builtInCall();
				}
				break;
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case PREFIX_LANGTAG:
				enterOuterAlt(_localctx, 3);
				{
				setState(1249);
				iriOrFunction();
				}
				break;
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 4);
				{
				setState(1250);
				rdfLiteral();
				}
				break;
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1251);
				numericLiteral();
				}
				break;
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 6);
				{
				setState(1252);
				booleanLiteral();
				}
				break;
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 7);
				{
				setState(1253);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BrackettedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BrackettedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackettedExpression; }
	}

	public final BrackettedExpressionContext brackettedExpression() throws RecognitionException {
		BrackettedExpressionContext _localctx = new BrackettedExpressionContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_brackettedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			match(T__1);
			setState(1257);
			expression();
			setState(1258);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuiltInCallContext extends ParserRuleContext {
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public TerminalNode STR() { return getToken(SparqlAutomaticParser.STR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LangExpressionContext langExpression() {
			return getRuleContext(LangExpressionContext.class,0);
		}
		public TerminalNode LANGMATCHES() { return getToken(SparqlAutomaticParser.LANGMATCHES, 0); }
		public TerminalNode DATATYPE() { return getToken(SparqlAutomaticParser.DATATYPE, 0); }
		public TerminalNode BOUND() { return getToken(SparqlAutomaticParser.BOUND, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode IRI() { return getToken(SparqlAutomaticParser.IRI, 0); }
		public TerminalNode URI() { return getToken(SparqlAutomaticParser.URI, 0); }
		public TerminalNode BNODE() { return getToken(SparqlAutomaticParser.BNODE, 0); }
		public TerminalNode NIL() { return getToken(SparqlAutomaticParser.NIL, 0); }
		public TerminalNode RAND() { return getToken(SparqlAutomaticParser.RAND, 0); }
		public TerminalNode ABS() { return getToken(SparqlAutomaticParser.ABS, 0); }
		public TerminalNode CEIL() { return getToken(SparqlAutomaticParser.CEIL, 0); }
		public TerminalNode FLOOR() { return getToken(SparqlAutomaticParser.FLOOR, 0); }
		public TerminalNode ROUND() { return getToken(SparqlAutomaticParser.ROUND, 0); }
		public TerminalNode CONCAT() { return getToken(SparqlAutomaticParser.CONCAT, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SubstringExpressionContext substringExpression() {
			return getRuleContext(SubstringExpressionContext.class,0);
		}
		public TerminalNode STRLEN() { return getToken(SparqlAutomaticParser.STRLEN, 0); }
		public StrReplaceExpressionContext strReplaceExpression() {
			return getRuleContext(StrReplaceExpressionContext.class,0);
		}
		public TerminalNode UCASE() { return getToken(SparqlAutomaticParser.UCASE, 0); }
		public TerminalNode LCASE() { return getToken(SparqlAutomaticParser.LCASE, 0); }
		public TerminalNode ENCODE_FOR_URI() { return getToken(SparqlAutomaticParser.ENCODE_FOR_URI, 0); }
		public TerminalNode CONTAINS() { return getToken(SparqlAutomaticParser.CONTAINS, 0); }
		public TerminalNode STRSTARTS() { return getToken(SparqlAutomaticParser.STRSTARTS, 0); }
		public TerminalNode STRENDS() { return getToken(SparqlAutomaticParser.STRENDS, 0); }
		public TerminalNode STRBEFORE() { return getToken(SparqlAutomaticParser.STRBEFORE, 0); }
		public TerminalNode STRAFTER() { return getToken(SparqlAutomaticParser.STRAFTER, 0); }
		public TerminalNode YEAR() { return getToken(SparqlAutomaticParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SparqlAutomaticParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(SparqlAutomaticParser.DAY, 0); }
		public TerminalNode HOURS() { return getToken(SparqlAutomaticParser.HOURS, 0); }
		public TerminalNode MINUTES() { return getToken(SparqlAutomaticParser.MINUTES, 0); }
		public TerminalNode SECONDS() { return getToken(SparqlAutomaticParser.SECONDS, 0); }
		public TerminalNode TIMEZONE() { return getToken(SparqlAutomaticParser.TIMEZONE, 0); }
		public TerminalNode TZ() { return getToken(SparqlAutomaticParser.TZ, 0); }
		public TerminalNode NOW() { return getToken(SparqlAutomaticParser.NOW, 0); }
		public TerminalNode UUID() { return getToken(SparqlAutomaticParser.UUID, 0); }
		public TerminalNode STRUUID() { return getToken(SparqlAutomaticParser.STRUUID, 0); }
		public TerminalNode MD5() { return getToken(SparqlAutomaticParser.MD5, 0); }
		public TerminalNode SHA1() { return getToken(SparqlAutomaticParser.SHA1, 0); }
		public TerminalNode SHA256() { return getToken(SparqlAutomaticParser.SHA256, 0); }
		public TerminalNode SHA384() { return getToken(SparqlAutomaticParser.SHA384, 0); }
		public TerminalNode SHA512() { return getToken(SparqlAutomaticParser.SHA512, 0); }
		public TerminalNode COALESCE() { return getToken(SparqlAutomaticParser.COALESCE, 0); }
		public TerminalNode IF() { return getToken(SparqlAutomaticParser.IF, 0); }
		public TerminalNode STRLANG() { return getToken(SparqlAutomaticParser.STRLANG, 0); }
		public TerminalNode STRDT() { return getToken(SparqlAutomaticParser.STRDT, 0); }
		public TerminalNode SAMETERM() { return getToken(SparqlAutomaticParser.SAMETERM, 0); }
		public TerminalNode ISIRI() { return getToken(SparqlAutomaticParser.ISIRI, 0); }
		public TerminalNode ISURI() { return getToken(SparqlAutomaticParser.ISURI, 0); }
		public TerminalNode ISBLANK() { return getToken(SparqlAutomaticParser.ISBLANK, 0); }
		public TerminalNode ISLITERAL() { return getToken(SparqlAutomaticParser.ISLITERAL, 0); }
		public TerminalNode ISNUMERIC() { return getToken(SparqlAutomaticParser.ISNUMERIC, 0); }
		public RegexExpressionContext regexExpression() {
			return getRuleContext(RegexExpressionContext.class,0);
		}
		public ExistsFuncContext existsFunc() {
			return getRuleContext(ExistsFuncContext.class,0);
		}
		public NotExistsFuncContext notExistsFunc() {
			return getRuleContext(NotExistsFuncContext.class,0);
		}
		public BuiltInCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInCall; }
	}

	public final BuiltInCallContext builtInCall() throws RecognitionException {
		BuiltInCallContext _localctx = new BuiltInCallContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_builtInCall);
		try {
			setState(1514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP_CONCAT:
			case COUNT:
			case SUM:
			case MIN:
			case MAX:
			case AVG:
			case STDEV:
			case SAMPLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1260);
				aggregate();
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1261);
				match(STR);
				setState(1262);
				match(T__1);
				setState(1263);
				expression();
				setState(1264);
				match(T__2);
				}
				break;
			case LANG:
				enterOuterAlt(_localctx, 3);
				{
				setState(1266);
				langExpression();
				}
				break;
			case LANGMATCHES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1267);
				match(LANGMATCHES);
				setState(1268);
				match(T__1);
				setState(1269);
				expression();
				setState(1270);
				match(T__7);
				setState(1271);
				expression();
				setState(1272);
				match(T__2);
				}
				break;
			case DATATYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1274);
				match(DATATYPE);
				setState(1275);
				match(T__1);
				setState(1276);
				expression();
				setState(1277);
				match(T__2);
				}
				break;
			case BOUND:
				enterOuterAlt(_localctx, 6);
				{
				setState(1279);
				match(BOUND);
				setState(1280);
				match(T__1);
				setState(1281);
				var();
				setState(1282);
				match(T__2);
				}
				break;
			case IRI:
				enterOuterAlt(_localctx, 7);
				{
				setState(1284);
				match(IRI);
				setState(1285);
				match(T__1);
				setState(1286);
				expression();
				setState(1287);
				match(T__2);
				}
				break;
			case URI:
				enterOuterAlt(_localctx, 8);
				{
				setState(1289);
				match(URI);
				setState(1290);
				match(T__1);
				setState(1291);
				expression();
				setState(1292);
				match(T__2);
				}
				break;
			case BNODE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1294);
				match(BNODE);
				setState(1300);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(1295);
					match(T__1);
					setState(1296);
					expression();
					setState(1297);
					match(T__2);
					}
					break;
				case NIL:
					{
					setState(1299);
					match(NIL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case RAND:
				enterOuterAlt(_localctx, 10);
				{
				setState(1302);
				match(RAND);
				setState(1303);
				match(NIL);
				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 11);
				{
				setState(1304);
				match(ABS);
				setState(1305);
				match(T__1);
				setState(1306);
				expression();
				setState(1307);
				match(T__2);
				}
				break;
			case CEIL:
				enterOuterAlt(_localctx, 12);
				{
				setState(1309);
				match(CEIL);
				setState(1310);
				match(T__1);
				setState(1311);
				expression();
				setState(1312);
				match(T__2);
				}
				break;
			case FLOOR:
				enterOuterAlt(_localctx, 13);
				{
				setState(1314);
				match(FLOOR);
				setState(1315);
				match(T__1);
				setState(1316);
				expression();
				setState(1317);
				match(T__2);
				}
				break;
			case ROUND:
				enterOuterAlt(_localctx, 14);
				{
				setState(1319);
				match(ROUND);
				setState(1320);
				match(T__1);
				setState(1321);
				expression();
				setState(1322);
				match(T__2);
				}
				break;
			case CONCAT:
				enterOuterAlt(_localctx, 15);
				{
				setState(1324);
				match(CONCAT);
				setState(1325);
				expressionList();
				}
				break;
			case SUBSTR:
				enterOuterAlt(_localctx, 16);
				{
				setState(1326);
				substringExpression();
				}
				break;
			case STRLEN:
				enterOuterAlt(_localctx, 17);
				{
				setState(1327);
				match(STRLEN);
				setState(1328);
				match(T__1);
				setState(1329);
				expression();
				setState(1330);
				match(T__2);
				}
				break;
			case REPLACE:
				enterOuterAlt(_localctx, 18);
				{
				setState(1332);
				strReplaceExpression();
				}
				break;
			case UCASE:
				enterOuterAlt(_localctx, 19);
				{
				setState(1333);
				match(UCASE);
				setState(1334);
				match(T__1);
				setState(1335);
				expression();
				setState(1336);
				match(T__2);
				}
				break;
			case LCASE:
				enterOuterAlt(_localctx, 20);
				{
				setState(1338);
				match(LCASE);
				setState(1339);
				match(T__1);
				setState(1340);
				expression();
				setState(1341);
				match(T__2);
				}
				break;
			case ENCODE_FOR_URI:
				enterOuterAlt(_localctx, 21);
				{
				setState(1343);
				match(ENCODE_FOR_URI);
				setState(1344);
				match(T__1);
				setState(1345);
				expression();
				setState(1346);
				match(T__2);
				}
				break;
			case CONTAINS:
				enterOuterAlt(_localctx, 22);
				{
				setState(1348);
				match(CONTAINS);
				setState(1349);
				match(T__1);
				setState(1350);
				expression();
				setState(1351);
				match(T__7);
				setState(1352);
				expression();
				setState(1353);
				match(T__2);
				}
				break;
			case STRSTARTS:
				enterOuterAlt(_localctx, 23);
				{
				setState(1355);
				match(STRSTARTS);
				setState(1356);
				match(T__1);
				setState(1357);
				expression();
				setState(1358);
				match(T__7);
				setState(1359);
				expression();
				setState(1360);
				match(T__2);
				}
				break;
			case STRENDS:
				enterOuterAlt(_localctx, 24);
				{
				setState(1362);
				match(STRENDS);
				setState(1363);
				match(T__1);
				setState(1364);
				expression();
				setState(1365);
				match(T__7);
				setState(1366);
				expression();
				setState(1367);
				match(T__2);
				}
				break;
			case STRBEFORE:
				enterOuterAlt(_localctx, 25);
				{
				setState(1369);
				match(STRBEFORE);
				setState(1370);
				match(T__1);
				setState(1371);
				expression();
				setState(1372);
				match(T__7);
				setState(1373);
				expression();
				setState(1374);
				match(T__2);
				}
				break;
			case STRAFTER:
				enterOuterAlt(_localctx, 26);
				{
				setState(1376);
				match(STRAFTER);
				setState(1377);
				match(T__1);
				setState(1378);
				expression();
				setState(1379);
				match(T__7);
				setState(1380);
				expression();
				setState(1381);
				match(T__2);
				}
				break;
			case YEAR:
				enterOuterAlt(_localctx, 27);
				{
				setState(1383);
				match(YEAR);
				setState(1384);
				match(T__1);
				setState(1385);
				expression();
				setState(1386);
				match(T__2);
				}
				break;
			case MONTH:
				enterOuterAlt(_localctx, 28);
				{
				setState(1388);
				match(MONTH);
				setState(1389);
				match(T__1);
				setState(1390);
				expression();
				setState(1391);
				match(T__2);
				}
				break;
			case DAY:
				enterOuterAlt(_localctx, 29);
				{
				setState(1393);
				match(DAY);
				setState(1394);
				match(T__1);
				setState(1395);
				expression();
				setState(1396);
				match(T__2);
				}
				break;
			case HOURS:
				enterOuterAlt(_localctx, 30);
				{
				setState(1398);
				match(HOURS);
				setState(1399);
				match(T__1);
				setState(1400);
				expression();
				setState(1401);
				match(T__2);
				}
				break;
			case MINUTES:
				enterOuterAlt(_localctx, 31);
				{
				setState(1403);
				match(MINUTES);
				setState(1404);
				match(T__1);
				setState(1405);
				expression();
				setState(1406);
				match(T__2);
				}
				break;
			case SECONDS:
				enterOuterAlt(_localctx, 32);
				{
				setState(1408);
				match(SECONDS);
				setState(1409);
				match(T__1);
				setState(1410);
				expression();
				setState(1411);
				match(T__2);
				}
				break;
			case TIMEZONE:
				enterOuterAlt(_localctx, 33);
				{
				setState(1413);
				match(TIMEZONE);
				setState(1414);
				match(T__1);
				setState(1415);
				expression();
				setState(1416);
				match(T__2);
				}
				break;
			case TZ:
				enterOuterAlt(_localctx, 34);
				{
				setState(1418);
				match(TZ);
				setState(1419);
				match(T__1);
				setState(1420);
				expression();
				setState(1421);
				match(T__2);
				}
				break;
			case NOW:
				enterOuterAlt(_localctx, 35);
				{
				setState(1423);
				match(NOW);
				setState(1424);
				match(NIL);
				}
				break;
			case UUID:
				enterOuterAlt(_localctx, 36);
				{
				setState(1425);
				match(UUID);
				setState(1426);
				match(NIL);
				}
				break;
			case STRUUID:
				enterOuterAlt(_localctx, 37);
				{
				setState(1427);
				match(STRUUID);
				setState(1428);
				match(NIL);
				}
				break;
			case MD5:
				enterOuterAlt(_localctx, 38);
				{
				setState(1429);
				match(MD5);
				setState(1430);
				match(T__1);
				setState(1431);
				expression();
				setState(1432);
				match(T__2);
				}
				break;
			case SHA1:
				enterOuterAlt(_localctx, 39);
				{
				setState(1434);
				match(SHA1);
				setState(1435);
				match(T__1);
				setState(1436);
				expression();
				setState(1437);
				match(T__2);
				}
				break;
			case SHA256:
				enterOuterAlt(_localctx, 40);
				{
				setState(1439);
				match(SHA256);
				setState(1440);
				match(T__1);
				setState(1441);
				expression();
				setState(1442);
				match(T__2);
				}
				break;
			case SHA384:
				enterOuterAlt(_localctx, 41);
				{
				setState(1444);
				match(SHA384);
				setState(1445);
				match(T__1);
				setState(1446);
				expression();
				setState(1447);
				match(T__2);
				}
				break;
			case SHA512:
				enterOuterAlt(_localctx, 42);
				{
				setState(1449);
				match(SHA512);
				setState(1450);
				match(T__1);
				setState(1451);
				expression();
				setState(1452);
				match(T__2);
				}
				break;
			case COALESCE:
				enterOuterAlt(_localctx, 43);
				{
				setState(1454);
				match(COALESCE);
				setState(1455);
				expressionList();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 44);
				{
				setState(1456);
				match(IF);
				setState(1457);
				match(T__1);
				setState(1458);
				expression();
				setState(1459);
				match(T__7);
				setState(1460);
				expression();
				setState(1461);
				match(T__7);
				setState(1462);
				expression();
				setState(1463);
				match(T__2);
				}
				break;
			case STRLANG:
				enterOuterAlt(_localctx, 45);
				{
				setState(1465);
				match(STRLANG);
				setState(1466);
				match(T__1);
				setState(1467);
				expression();
				setState(1468);
				match(T__7);
				setState(1469);
				expression();
				setState(1470);
				match(T__2);
				}
				break;
			case STRDT:
				enterOuterAlt(_localctx, 46);
				{
				setState(1472);
				match(STRDT);
				setState(1473);
				match(T__1);
				setState(1474);
				expression();
				setState(1475);
				match(T__7);
				setState(1476);
				expression();
				setState(1477);
				match(T__2);
				}
				break;
			case SAMETERM:
				enterOuterAlt(_localctx, 47);
				{
				setState(1479);
				match(SAMETERM);
				setState(1480);
				match(T__1);
				setState(1481);
				expression();
				setState(1482);
				match(T__7);
				setState(1483);
				expression();
				setState(1484);
				match(T__2);
				}
				break;
			case ISIRI:
				enterOuterAlt(_localctx, 48);
				{
				setState(1486);
				match(ISIRI);
				setState(1487);
				match(T__1);
				setState(1488);
				expression();
				setState(1489);
				match(T__2);
				}
				break;
			case ISURI:
				enterOuterAlt(_localctx, 49);
				{
				setState(1491);
				match(ISURI);
				setState(1492);
				match(T__1);
				setState(1493);
				expression();
				setState(1494);
				match(T__2);
				}
				break;
			case ISBLANK:
				enterOuterAlt(_localctx, 50);
				{
				setState(1496);
				match(ISBLANK);
				setState(1497);
				match(T__1);
				setState(1498);
				expression();
				setState(1499);
				match(T__2);
				}
				break;
			case ISLITERAL:
				enterOuterAlt(_localctx, 51);
				{
				setState(1501);
				match(ISLITERAL);
				setState(1502);
				match(T__1);
				setState(1503);
				expression();
				setState(1504);
				match(T__2);
				}
				break;
			case ISNUMERIC:
				enterOuterAlt(_localctx, 52);
				{
				setState(1506);
				match(ISNUMERIC);
				setState(1507);
				match(T__1);
				setState(1508);
				expression();
				setState(1509);
				match(T__2);
				}
				break;
			case REGEX:
				enterOuterAlt(_localctx, 53);
				{
				setState(1511);
				regexExpression();
				}
				break;
			case EXISTS:
				enterOuterAlt(_localctx, 54);
				{
				setState(1512);
				existsFunc();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 55);
				{
				setState(1513);
				notExistsFunc();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegexExpressionContext extends ParserRuleContext {
		public TerminalNode REGEX() { return getToken(SparqlAutomaticParser.REGEX, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RegexExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexExpression; }
	}

	public final RegexExpressionContext regexExpression() throws RecognitionException {
		RegexExpressionContext _localctx = new RegexExpressionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_regexExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			match(REGEX);
			setState(1517);
			match(T__1);
			setState(1518);
			expression();
			setState(1519);
			match(T__7);
			setState(1520);
			expression();
			setState(1523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(1521);
				match(T__7);
				setState(1522);
				expression();
				}
			}

			setState(1525);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LangExpressionContext extends ParserRuleContext {
		public TerminalNode LANG() { return getToken(SparqlAutomaticParser.LANG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LangExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_langExpression; }
	}

	public final LangExpressionContext langExpression() throws RecognitionException {
		LangExpressionContext _localctx = new LangExpressionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_langExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			match(LANG);
			setState(1528);
			match(T__1);
			setState(1529);
			expression();
			setState(1530);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubstringExpressionContext extends ParserRuleContext {
		public TerminalNode SUBSTR() { return getToken(SparqlAutomaticParser.SUBSTR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubstringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substringExpression; }
	}

	public final SubstringExpressionContext substringExpression() throws RecognitionException {
		SubstringExpressionContext _localctx = new SubstringExpressionContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_substringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			match(SUBSTR);
			setState(1533);
			match(T__1);
			setState(1534);
			expression();
			setState(1535);
			match(T__7);
			setState(1536);
			expression();
			setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(1537);
				match(T__7);
				setState(1538);
				expression();
				}
			}

			setState(1541);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrReplaceExpressionContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(SparqlAutomaticParser.REPLACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StrReplaceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strReplaceExpression; }
	}

	public final StrReplaceExpressionContext strReplaceExpression() throws RecognitionException {
		StrReplaceExpressionContext _localctx = new StrReplaceExpressionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_strReplaceExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			match(REPLACE);
			setState(1544);
			match(T__1);
			setState(1545);
			expression();
			setState(1546);
			match(T__7);
			setState(1547);
			expression();
			setState(1548);
			match(T__7);
			setState(1549);
			expression();
			setState(1552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(1550);
				match(T__7);
				setState(1551);
				expression();
				}
			}

			setState(1554);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExistsFuncContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(SparqlAutomaticParser.EXISTS, 0); }
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public ExistsFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsFunc; }
	}

	public final ExistsFuncContext existsFunc() throws RecognitionException {
		ExistsFuncContext _localctx = new ExistsFuncContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_existsFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			match(EXISTS);
			setState(1557);
			groupGraphPattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotExistsFuncContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SparqlAutomaticParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparqlAutomaticParser.EXISTS, 0); }
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public NotExistsFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExistsFunc; }
	}

	public final NotExistsFuncContext notExistsFunc() throws RecognitionException {
		NotExistsFuncContext _localctx = new NotExistsFuncContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_notExistsFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			match(NOT);
			setState(1560);
			match(EXISTS);
			setState(1561);
			groupGraphPattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregateContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(SparqlAutomaticParser.COUNT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SparqlAutomaticParser.DISTINCT, 0); }
		public TerminalNode SUM() { return getToken(SparqlAutomaticParser.SUM, 0); }
		public TerminalNode MIN() { return getToken(SparqlAutomaticParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(SparqlAutomaticParser.MAX, 0); }
		public TerminalNode AVG() { return getToken(SparqlAutomaticParser.AVG, 0); }
		public TerminalNode STDEV() { return getToken(SparqlAutomaticParser.STDEV, 0); }
		public TerminalNode SAMPLE() { return getToken(SparqlAutomaticParser.SAMPLE, 0); }
		public TerminalNode GROUP_CONCAT() { return getToken(SparqlAutomaticParser.GROUP_CONCAT, 0); }
		public TerminalNode SEPARATOR() { return getToken(SparqlAutomaticParser.SEPARATOR, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_aggregate);
		int _la;
		try {
			setState(1635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1563);
				match(COUNT);
				setState(1564);
				match(T__1);
				setState(1566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(1565);
					match(DISTINCT);
					}
				}

				setState(1570);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(1568);
					match(T__0);
					}
					break;
				case T__1:
				case T__12:
				case T__14:
				case T__25:
				case T__27:
				case T__28:
				case GROUP_CONCAT:
				case NOT:
				case STR:
				case LANG:
				case LANGMATCHES:
				case DATATYPE:
				case BOUND:
				case IRI:
				case URI:
				case BNODE:
				case RAND:
				case ABS:
				case CEIL:
				case FLOOR:
				case ROUND:
				case CONCAT:
				case STRLEN:
				case UCASE:
				case LCASE:
				case ENCODE_FOR_URI:
				case CONTAINS:
				case STRSTARTS:
				case STRENDS:
				case STRBEFORE:
				case STRAFTER:
				case YEAR:
				case MONTH:
				case DAY:
				case HOURS:
				case MINUTES:
				case SECONDS:
				case TIMEZONE:
				case TZ:
				case NOW:
				case UUID:
				case STRUUID:
				case SHA1:
				case SHA256:
				case SHA384:
				case SHA512:
				case MD5:
				case COALESCE:
				case IF:
				case STRLANG:
				case STRDT:
				case SAMETERM:
				case ISIRI:
				case ISURI:
				case ISBLANK:
				case ISLITERAL:
				case ISNUMERIC:
				case REGEX:
				case SUBSTR:
				case REPLACE:
				case EXISTS:
				case COUNT:
				case SUM:
				case MIN:
				case MAX:
				case AVG:
				case STDEV:
				case SAMPLE:
				case IRI_REF:
				case PNAME_NS:
				case PNAME_LN:
				case VAR1:
				case VAR2:
				case PREFIX_LANGTAG:
				case INTEGER:
				case DECIMAL:
				case DOUBLE:
				case INTEGER_POSITIVE:
				case DECIMAL_POSITIVE:
				case DOUBLE_POSITIVE:
				case INTEGER_NEGATIVE:
				case DECIMAL_NEGATIVE:
				case DOUBLE_NEGATIVE:
				case STRING_LITERAL1:
				case STRING_LITERAL2:
				case STRING_LITERAL_LONG1:
				case STRING_LITERAL_LONG2:
					{
					setState(1569);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1572);
				match(T__2);
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1573);
				match(SUM);
				setState(1574);
				match(T__1);
				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(1575);
					match(DISTINCT);
					}
				}

				setState(1578);
				expression();
				setState(1579);
				match(T__2);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1581);
				match(MIN);
				setState(1582);
				match(T__1);
				setState(1584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(1583);
					match(DISTINCT);
					}
				}

				setState(1586);
				expression();
				setState(1587);
				match(T__2);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 4);
				{
				setState(1589);
				match(MAX);
				setState(1590);
				match(T__1);
				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(1591);
					match(DISTINCT);
					}
				}

				setState(1594);
				expression();
				setState(1595);
				match(T__2);
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 5);
				{
				setState(1597);
				match(AVG);
				setState(1598);
				match(T__1);
				setState(1600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(1599);
					match(DISTINCT);
					}
				}

				setState(1602);
				expression();
				setState(1603);
				match(T__2);
				}
				break;
			case STDEV:
				enterOuterAlt(_localctx, 6);
				{
				setState(1605);
				match(STDEV);
				setState(1606);
				match(T__1);
				setState(1608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(1607);
					match(DISTINCT);
					}
				}

				setState(1610);
				expression();
				setState(1611);
				match(T__2);
				}
				break;
			case SAMPLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1613);
				match(SAMPLE);
				setState(1614);
				match(T__1);
				setState(1616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(1615);
					match(DISTINCT);
					}
				}

				setState(1618);
				expression();
				setState(1619);
				match(T__2);
				}
				break;
			case GROUP_CONCAT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1621);
				match(GROUP_CONCAT);
				setState(1622);
				match(T__1);
				setState(1624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(1623);
					match(DISTINCT);
					}
				}

				setState(1626);
				expression();
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(1627);
					match(T__5);
					setState(1628);
					match(SEPARATOR);
					setState(1629);
					match(T__19);
					setState(1630);
					string();
					}
				}

				setState(1633);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IriOrFunctionContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public IriOrFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iriOrFunction; }
	}

	public final IriOrFunctionContext iriOrFunction() throws RecognitionException {
		IriOrFunctionContext _localctx = new IriOrFunctionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_iriOrFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			iri();
			setState(1639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==NIL) {
				{
				setState(1638);
				argList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RdfLiteralContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode LANGTAG() { return getToken(SparqlAutomaticParser.LANGTAG, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public RdfLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdfLiteral; }
	}

	public final RdfLiteralContext rdfLiteral() throws RecognitionException {
		RdfLiteralContext _localctx = new RdfLiteralContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_rdfLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			string();
			setState(1645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGTAG:
				{
				setState(1642);
				match(LANGTAG);
				}
				break;
			case T__26:
				{
				{
				setState(1643);
				match(T__26);
				setState(1644);
				iri();
				}
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__10:
			case T__11:
			case T__12:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case AS:
			case VALUES:
			case GRAPH:
			case OPTIONAL:
			case SERVICE:
			case BIND:
			case UNDEF:
			case MINUS:
			case FILTER:
			case NOT:
			case IN:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR1:
			case VAR2:
			case PREFIX_LANGTAG:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case NIL:
			case ANON:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralContext extends ParserRuleContext {
		public NumericLiteralUnsignedContext numericLiteralUnsigned() {
			return getRuleContext(NumericLiteralUnsignedContext.class,0);
		}
		public NumericLiteralPositiveContext numericLiteralPositive() {
			return getRuleContext(NumericLiteralPositiveContext.class,0);
		}
		public NumericLiteralNegativeContext numericLiteralNegative() {
			return getRuleContext(NumericLiteralNegativeContext.class,0);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_numericLiteral);
		try {
			setState(1650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1647);
				numericLiteralUnsigned();
				}
				break;
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1648);
				numericLiteralPositive();
				}
				break;
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1649);
				numericLiteralNegative();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralUnsignedContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SparqlAutomaticParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(SparqlAutomaticParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(SparqlAutomaticParser.DOUBLE, 0); }
		public NumericLiteralUnsignedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteralUnsigned; }
	}

	public final NumericLiteralUnsignedContext numericLiteralUnsigned() throws RecognitionException {
		NumericLiteralUnsignedContext _localctx = new NumericLiteralUnsignedContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_numericLiteralUnsigned);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
			_la = _input.LA(1);
			if ( !(((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralPositiveContext extends ParserRuleContext {
		public TerminalNode INTEGER_POSITIVE() { return getToken(SparqlAutomaticParser.INTEGER_POSITIVE, 0); }
		public TerminalNode DECIMAL_POSITIVE() { return getToken(SparqlAutomaticParser.DECIMAL_POSITIVE, 0); }
		public TerminalNode DOUBLE_POSITIVE() { return getToken(SparqlAutomaticParser.DOUBLE_POSITIVE, 0); }
		public NumericLiteralPositiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteralPositive; }
	}

	public final NumericLiteralPositiveContext numericLiteralPositive() throws RecognitionException {
		NumericLiteralPositiveContext _localctx = new NumericLiteralPositiveContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_numericLiteralPositive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			_la = _input.LA(1);
			if ( !(((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralNegativeContext extends ParserRuleContext {
		public TerminalNode INTEGER_NEGATIVE() { return getToken(SparqlAutomaticParser.INTEGER_NEGATIVE, 0); }
		public TerminalNode DECIMAL_NEGATIVE() { return getToken(SparqlAutomaticParser.DECIMAL_NEGATIVE, 0); }
		public TerminalNode DOUBLE_NEGATIVE() { return getToken(SparqlAutomaticParser.DOUBLE_NEGATIVE, 0); }
		public NumericLiteralNegativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteralNegative; }
	}

	public final NumericLiteralNegativeContext numericLiteralNegative() throws RecognitionException {
		NumericLiteralNegativeContext _localctx = new NumericLiteralNegativeContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_numericLiteralNegative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			_la = _input.LA(1);
			if ( !(((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL1() { return getToken(SparqlAutomaticParser.STRING_LITERAL1, 0); }
		public TerminalNode STRING_LITERAL2() { return getToken(SparqlAutomaticParser.STRING_LITERAL2, 0); }
		public TerminalNode STRING_LITERAL_LONG1() { return getToken(SparqlAutomaticParser.STRING_LITERAL_LONG1, 0); }
		public TerminalNode STRING_LITERAL_LONG2() { return getToken(SparqlAutomaticParser.STRING_LITERAL_LONG2, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			_la = _input.LA(1);
			if ( !(((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 15L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IriContext extends ParserRuleContext {
		public IrirefContext iriref() {
			return getRuleContext(IrirefContext.class,0);
		}
		public PrefixedNameContext prefixedName() {
			return getRuleContext(PrefixedNameContext.class,0);
		}
		public TerminalNode PREFIX_LANGTAG() { return getToken(SparqlAutomaticParser.PREFIX_LANGTAG, 0); }
		public IriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iri; }
	}

	public final IriContext iri() throws RecognitionException {
		IriContext _localctx = new IriContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_iri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PREFIX_LANGTAG) {
				{
				setState(1662);
				match(PREFIX_LANGTAG);
				}
			}

			setState(1667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRI_REF:
				{
				setState(1665);
				iriref();
				}
				break;
			case PNAME_NS:
			case PNAME_LN:
				{
				setState(1666);
				prefixedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixedNameContext extends ParserRuleContext {
		public PnameLnContext pnameLn() {
			return getRuleContext(PnameLnContext.class,0);
		}
		public PnameNsContext pnameNs() {
			return getRuleContext(PnameNsContext.class,0);
		}
		public PrefixedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedName; }
	}

	public final PrefixedNameContext prefixedName() throws RecognitionException {
		PrefixedNameContext _localctx = new PrefixedNameContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_prefixedName);
		try {
			setState(1671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1669);
				pnameLn();
				}
				break;
			case PNAME_NS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1670);
				pnameNs();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlankNodeContext extends ParserRuleContext {
		public TerminalNode BLANK_NODE_LABEL() { return getToken(SparqlAutomaticParser.BLANK_NODE_LABEL, 0); }
		public TerminalNode ANON() { return getToken(SparqlAutomaticParser.ANON, 0); }
		public BlankNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNode; }
	}

	public final BlankNodeContext blankNode() throws RecognitionException {
		BlankNodeContext _localctx = new BlankNodeContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_blankNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			_la = _input.LA(1);
			if ( !(_la==BLANK_NODE_LABEL || _la==ANON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IrirefContext extends ParserRuleContext {
		public TerminalNode IRI_REF() { return getToken(SparqlAutomaticParser.IRI_REF, 0); }
		public IrirefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iriref; }
	}

	public final IrirefContext iriref() throws RecognitionException {
		IrirefContext _localctx = new IrirefContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_iriref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
			match(IRI_REF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PnameLnContext extends ParserRuleContext {
		public TerminalNode PNAME_LN() { return getToken(SparqlAutomaticParser.PNAME_LN, 0); }
		public PnameLnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pnameLn; }
	}

	public final PnameLnContext pnameLn() throws RecognitionException {
		PnameLnContext _localctx = new PnameLnContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_pnameLn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			match(PNAME_LN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PnameNsContext extends ParserRuleContext {
		public TerminalNode PNAME_NS() { return getToken(SparqlAutomaticParser.PNAME_NS, 0); }
		public PnameNsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pnameNs; }
	}

	public final PnameNsContext pnameNs() throws RecognitionException {
		PnameNsContext _localctx = new PnameNsContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_pnameNs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			match(PNAME_NS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00b0\u0692\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0001\u0000\u0001\u0000\u0003\u0000\u0141\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u014a\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u0150\b\u0002\n\u0002\f\u0002\u0153\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u015e\b\u0005\n\u0005\f\u0005\u0161\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u016d\b\u0007\u0001"+
		"\u0007\u0004\u0007\u0170\b\u0007\u000b\u0007\f\u0007\u0171\u0001\u0007"+
		"\u0003\u0007\u0175\b\u0007\u0001\b\u0001\b\u0003\b\u0179\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u0186\b\u000b\n\u000b\f\u000b\u0189\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u018f\b\u000b\n"+
		"\u000b\f\u000b\u0192\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0197\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u019b\b\u000b"+
		"\u0001\f\u0001\f\u0004\f\u019f\b\f\u000b\f\f\f\u01a0\u0001\f\u0003\f\u01a4"+
		"\b\f\u0001\f\u0005\f\u01a7\b\f\n\f\f\f\u01aa\t\f\u0001\f\u0003\f\u01ad"+
		"\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u01b3\b\r\n\r\f\r\u01b6\t"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u01be\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0003\u0012\u01c8\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0003\u0013\u01cd\b\u0013\u0001\u0013\u0003\u0013"+
		"\u01d0\b\u0013\u0001\u0013\u0003\u0013\u01d3\b\u0013\u0001\u0013\u0003"+
		"\u0013\u01d6\b\u0013\u0001\u0014\u0001\u0014\u0004\u0014\u01da\b\u0014"+
		"\u000b\u0014\f\u0014\u01db\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01e4\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u01e9\b\u0015\u0001\u0016\u0001\u0016\u0004\u0016"+
		"\u01ed\b\u0016\u000b\u0016\f\u0016\u01ee\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01f5\b\u0018\u0001\u0018\u0004\u0018\u01f8"+
		"\b\u0018\u000b\u0018\f\u0018\u01f9\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0200\b\u0019\u0003\u0019\u0202\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0206\b\u001a\u0001\u001a\u0003\u001a\u0209"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u020d\b\u001a\u0001\u001a"+
		"\u0003\u001a\u0210\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0214\b"+
		"\u001a\u0001\u001a\u0003\u001a\u0217\b\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u021b\b\u001a\u0001\u001a\u0003\u001a\u021e\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0222\b\u001a\u0001\u001a\u0003\u001a\u0225\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0229\b\u001a\u0001\u001a\u0003"+
		"\u001a\u022c\b\u001a\u0003\u001a\u022e\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u023b\b\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0241\b\u001f\u0003\u001f"+
		"\u0243\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u0250\b \u0001!\u0001!\u0003!\u0254\b!\u0001"+
		"!\u0001!\u0001!\u0003!\u0259\b!\u0001\"\u0001\"\u0003\"\u025d\b\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0003#\u0263\b#\u0001#\u0001#\u0001$\u0001$\u0003"+
		"$\u0269\b$\u0001$\u0001$\u0001%\u0001%\u0003%\u026f\b%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0003&\u0277\b&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0003\'\u027f\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0003+\u0293\b+\u0001+\u0001+\u0003+\u0297\b+\u0001+\u0003"+
		"+\u029a\b+\u0001+\u0005+\u029d\b+\n+\f+\u02a0\t+\u0001+\u0001+\u0001+"+
		"\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u02af\b.\u0001/\u0001/\u0003/\u02b3\b/\u0001/\u0003/\u02b6\b"+
		"/\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00031\u02bf\b1\u0001"+
		"2\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00014\u00034\u02ca"+
		"\b4\u00014\u00014\u00034\u02ce\b4\u00014\u00034\u02d1\b4\u00054\u02d3"+
		"\b4\n4\f4\u02d6\t4\u00015\u00015\u00015\u00015\u00035\u02dc\b5\u00015"+
		"\u00015\u00016\u00016\u00016\u00056\u02e3\b6\n6\f6\u02e6\t6\u00016\u0003"+
		"6\u02e9\b6\u00017\u00017\u00017\u00037\u02ee\b7\u00017\u00017\u00018\u0003"+
		"8\u02f3\b8\u00018\u00058\u02f6\b8\n8\f8\u02f9\t8\u00019\u00019\u00039"+
		"\u02fd\b9\u00019\u00039\u0300\b9\u0001:\u0001:\u0001:\u0003:\u0305\b:"+
		"\u0003:\u0307\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0003;\u0311\b;\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001"+
		">\u0001>\u0003>\u031c\b>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001A\u0001A\u0003A\u032d"+
		"\bA\u0001B\u0001B\u0001B\u0005B\u0332\bB\nB\fB\u0335\tB\u0001B\u0001B"+
		"\u0001C\u0001C\u0001C\u0005C\u033c\bC\nC\fC\u033f\tC\u0001C\u0003C\u0342"+
		"\bC\u0001C\u0001C\u0005C\u0346\bC\nC\fC\u0349\tC\u0001C\u0001C\u0001D"+
		"\u0001D\u0005D\u034f\bD\nD\fD\u0352\tD\u0001D\u0001D\u0003D\u0356\bD\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0003E\u035d\bE\u0001F\u0001F\u0001F\u0001"+
		"G\u0001G\u0001G\u0005G\u0365\bG\nG\fG\u0368\tG\u0001H\u0001H\u0001H\u0001"+
		"I\u0001I\u0001I\u0003I\u0370\bI\u0001J\u0001J\u0001J\u0001K\u0001K\u0001"+
		"K\u0003K\u0378\bK\u0001K\u0001K\u0001K\u0005K\u037d\bK\nK\fK\u0380\tK"+
		"\u0001K\u0001K\u0003K\u0384\bK\u0001L\u0001L\u0001L\u0001L\u0001L\u0005"+
		"L\u038b\bL\nL\fL\u038e\tL\u0001L\u0001L\u0003L\u0392\bL\u0001M\u0001M"+
		"\u0003M\u0396\bM\u0001M\u0001M\u0001N\u0001N\u0001N\u0003N\u039d\bN\u0003"+
		"N\u039f\bN\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u03a7\bO\u0001"+
		"P\u0003P\u03aa\bP\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u03b2"+
		"\bQ\u0005Q\u03b4\bQ\nQ\fQ\u03b7\tQ\u0001R\u0001R\u0003R\u03bb\bR\u0001"+
		"S\u0001S\u0001S\u0005S\u03c0\bS\nS\fS\u03c3\tS\u0001T\u0001T\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0003U\u03cd\bU\u0001V\u0003V\u03d0\bV\u0001"+
		"W\u0001W\u0001W\u0003W\u03d5\bW\u0005W\u03d7\bW\nW\fW\u03da\tW\u0001X"+
		"\u0001X\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001"+
		"\\\u0001\\\u0003\\\u03e8\b\\\u0001]\u0001]\u0001]\u0005]\u03ed\b]\n]\f"+
		"]\u03f0\t]\u0001^\u0001^\u0001_\u0001_\u0001`\u0001`\u0001`\u0005`\u03f9"+
		"\b`\n`\f`\u03fc\t`\u0001a\u0001a\u0001a\u0005a\u0401\ba\na\fa\u0404\t"+
		"a\u0001b\u0001b\u0003b\u0408\bb\u0001c\u0001c\u0001c\u0003c\u040d\bc\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0003d\u0416\bd\u0003d\u0418"+
		"\bd\u0001d\u0001d\u0003d\u041c\bd\u0001e\u0001e\u0001f\u0001f\u0001g\u0001"+
		"g\u0001g\u0001g\u0001g\u0001g\u0001g\u0001g\u0003g\u042a\bg\u0001h\u0001"+
		"h\u0001h\u0001h\u0001h\u0005h\u0431\bh\nh\fh\u0434\th\u0003h\u0436\bh"+
		"\u0001h\u0003h\u0439\bh\u0001i\u0001i\u0001i\u0001i\u0001i\u0003i\u0440"+
		"\bi\u0003i\u0442\bi\u0001j\u0001j\u0001k\u0001k\u0003k\u0448\bk\u0001"+
		"l\u0001l\u0001l\u0001l\u0001m\u0001m\u0003m\u0450\bm\u0001n\u0001n\u0001"+
		"n\u0001n\u0001o\u0001o\u0004o\u0458\bo\u000bo\fo\u0459\u0001o\u0001o\u0001"+
		"p\u0001p\u0004p\u0460\bp\u000bp\fp\u0461\u0001p\u0001p\u0001q\u0001q\u0003"+
		"q\u0468\bq\u0001r\u0001r\u0003r\u046c\br\u0001s\u0001s\u0003s\u0470\b"+
		"s\u0001t\u0001t\u0003t\u0474\bt\u0001u\u0001u\u0001v\u0001v\u0001v\u0001"+
		"v\u0001v\u0001v\u0003v\u047e\bv\u0001w\u0001w\u0001x\u0001x\u0001x\u0005"+
		"x\u0485\bx\nx\fx\u0488\tx\u0001y\u0001y\u0001y\u0005y\u048d\by\ny\fy\u0490"+
		"\ty\u0001z\u0001z\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0003{\u04a6\b{\u0001|\u0001|\u0001}\u0001}\u0005}\u04ac\b}\n}\f}\u04af"+
		"\t}\u0001~\u0001~\u0001~\u0001~\u0001~\u0003~\u04b6\b~\u0001\u007f\u0001"+
		"\u007f\u0001\u0080\u0001\u0080\u0001\u0081\u0001\u0081\u0003\u0081\u04be"+
		"\b\u0081\u0001\u0081\u0005\u0081\u04c1\b\u0081\n\u0081\f\u0081\u04c4\t"+
		"\u0081\u0001\u0082\u0001\u0082\u0005\u0082\u04c8\b\u0082\n\u0082\f\u0082"+
		"\u04cb\t\u0082\u0001\u0083\u0001\u0083\u0003\u0083\u04cf\b\u0083\u0001"+
		"\u0084\u0001\u0084\u0001\u0084\u0001\u0085\u0001\u0085\u0001\u0085\u0001"+
		"\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001"+
		"\u0086\u0003\u0086\u04de\b\u0086\u0001\u0087\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0003\u0087\u04e7\b\u0087\u0001"+
		"\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0003\u0089\u0515\b\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0003"+
		"\u0089\u05eb\b\u0089\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001"+
		"\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u05f4\b\u008a\u0001\u008a\u0001"+
		"\u008a\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001"+
		"\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001"+
		"\u008c\u0003\u008c\u0604\b\u008c\u0001\u008c\u0001\u008c\u0001\u008d\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001"+
		"\u008d\u0001\u008d\u0003\u008d\u0611\b\u008d\u0001\u008d\u0001\u008d\u0001"+
		"\u008e\u0001\u008e\u0001\u008e\u0001\u008f\u0001\u008f\u0001\u008f\u0001"+
		"\u008f\u0001\u0090\u0001\u0090\u0001\u0090\u0003\u0090\u061f\b\u0090\u0001"+
		"\u0090\u0001\u0090\u0003\u0090\u0623\b\u0090\u0001\u0090\u0001\u0090\u0001"+
		"\u0090\u0001\u0090\u0003\u0090\u0629\b\u0090\u0001\u0090\u0001\u0090\u0001"+
		"\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0003\u0090\u0631\b\u0090\u0001"+
		"\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0003"+
		"\u0090\u0639\b\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001"+
		"\u0090\u0001\u0090\u0003\u0090\u0641\b\u0090\u0001\u0090\u0001\u0090\u0001"+
		"\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0003\u0090\u0649\b\u0090\u0001"+
		"\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0003"+
		"\u0090\u0651\b\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001"+
		"\u0090\u0001\u0090\u0003\u0090\u0659\b\u0090\u0001\u0090\u0001\u0090\u0001"+
		"\u0090\u0001\u0090\u0001\u0090\u0003\u0090\u0660\b\u0090\u0001\u0090\u0001"+
		"\u0090\u0003\u0090\u0664\b\u0090\u0001\u0091\u0001\u0091\u0003\u0091\u0668"+
		"\b\u0091\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0003\u0092\u066e"+
		"\b\u0092\u0001\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u0673\b\u0093"+
		"\u0001\u0094\u0001\u0094\u0001\u0095\u0001\u0095\u0001\u0096\u0001\u0096"+
		"\u0001\u0097\u0001\u0097\u0001\u0098\u0001\u0098\u0001\u0099\u0003\u0099"+
		"\u0680\b\u0099\u0001\u0099\u0001\u0099\u0003\u0099\u0684\b\u0099\u0001"+
		"\u009a\u0001\u009a\u0003\u009a\u0688\b\u009a\u0001\u009b\u0001\u009b\u0001"+
		"\u009c\u0001\u009c\u0001\u009d\u0001\u009d\u0001\u009e\u0001\u009e\u0001"+
		"\u009e\u0000\u0000\u009f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u0000\t\u0001\u0000!\"\u0001\u0000/0\u0001\u0000\u0092\u0093"+
		"\u0001\u0000\u0096\u0098\u0001\u0000\u0099\u009b\u0001\u0000\u009c\u009e"+
		"\u0001\u0000\u001c\u001d\u0001\u0000\u00a0\u00a3\u0002\u0000\u0091\u0091"+
		"\u00a6\u00a6\u070a\u0000\u0140\u0001\u0000\u0000\u0000\u0002\u0144\u0001"+
		"\u0000\u0000\u0000\u0004\u0151\u0001\u0000\u0000\u0000\u0006\u0154\u0001"+
		"\u0000\u0000\u0000\b\u0157\u0001\u0000\u0000\u0000\n\u015b\u0001\u0000"+
		"\u0000\u0000\f\u0165\u0001\u0000\u0000\u0000\u000e\u016a\u0001\u0000\u0000"+
		"\u0000\u0010\u0178\u0001\u0000\u0000\u0000\u0012\u017a\u0001\u0000\u0000"+
		"\u0000\u0014\u017e\u0001\u0000\u0000\u0000\u0016\u0182\u0001\u0000\u0000"+
		"\u0000\u0018\u019c\u0001\u0000\u0000\u0000\u001a\u01b0\u0001\u0000\u0000"+
		"\u0000\u001c\u01ba\u0001\u0000\u0000\u0000\u001e\u01bf\u0001\u0000\u0000"+
		"\u0000 \u01c1\u0001\u0000\u0000\u0000\"\u01c4\u0001\u0000\u0000\u0000"+
		"$\u01c7\u0001\u0000\u0000\u0000&\u01cc\u0001\u0000\u0000\u0000(\u01d7"+
		"\u0001\u0000\u0000\u0000*\u01e8\u0001\u0000\u0000\u0000,\u01ea\u0001\u0000"+
		"\u0000\u0000.\u01f0\u0001\u0000\u0000\u00000\u01f4\u0001\u0000\u0000\u0000"+
		"2\u0201\u0001\u0000\u0000\u00004\u022d\u0001\u0000\u0000\u00006\u022f"+
		"\u0001\u0000\u0000\u00008\u0232\u0001\u0000\u0000\u0000:\u0235\u0001\u0000"+
		"\u0000\u0000<\u023a\u0001\u0000\u0000\u0000>\u023c\u0001\u0000\u0000\u0000"+
		"@\u024f\u0001\u0000\u0000\u0000B\u0251\u0001\u0000\u0000\u0000D\u025a"+
		"\u0001\u0000\u0000\u0000F\u0260\u0001\u0000\u0000\u0000H\u0266\u0001\u0000"+
		"\u0000\u0000J\u026c\u0001\u0000\u0000\u0000L\u0274\u0001\u0000\u0000\u0000"+
		"N\u027c\u0001\u0000\u0000\u0000P\u0284\u0001\u0000\u0000\u0000R\u0288"+
		"\u0001\u0000\u0000\u0000T\u028c\u0001\u0000\u0000\u0000V\u0292\u0001\u0000"+
		"\u0000\u0000X\u02a4\u0001\u0000\u0000\u0000Z\u02a7\u0001\u0000\u0000\u0000"+
		"\\\u02aa\u0001\u0000\u0000\u0000^\u02b5\u0001\u0000\u0000\u0000`\u02b7"+
		"\u0001\u0000\u0000\u0000b\u02be\u0001\u0000\u0000\u0000d\u02c0\u0001\u0000"+
		"\u0000\u0000f\u02c4\u0001\u0000\u0000\u0000h\u02c9\u0001\u0000\u0000\u0000"+
		"j\u02d7\u0001\u0000\u0000\u0000l\u02df\u0001\u0000\u0000\u0000n\u02ea"+
		"\u0001\u0000\u0000\u0000p\u02f2\u0001\u0000\u0000\u0000r\u02fa\u0001\u0000"+
		"\u0000\u0000t\u0301\u0001\u0000\u0000\u0000v\u0310\u0001\u0000\u0000\u0000"+
		"x\u0312\u0001\u0000\u0000\u0000z\u0315\u0001\u0000\u0000\u0000|\u0319"+
		"\u0001\u0000\u0000\u0000~\u0320\u0001\u0000\u0000\u0000\u0080\u0327\u0001"+
		"\u0000\u0000\u0000\u0082\u032c\u0001\u0000\u0000\u0000\u0084\u032e\u0001"+
		"\u0000\u0000\u0000\u0086\u0341\u0001\u0000\u0000\u0000\u0088\u0355\u0001"+
		"\u0000\u0000\u0000\u008a\u035c\u0001\u0000\u0000\u0000\u008c\u035e\u0001"+
		"\u0000\u0000\u0000\u008e\u0361\u0001\u0000\u0000\u0000\u0090\u0369\u0001"+
		"\u0000\u0000\u0000\u0092\u036f\u0001\u0000\u0000\u0000\u0094\u0371\u0001"+
		"\u0000\u0000\u0000\u0096\u0383\u0001\u0000\u0000\u0000\u0098\u0391\u0001"+
		"\u0000\u0000\u0000\u009a\u0393\u0001\u0000\u0000\u0000\u009c\u0399\u0001"+
		"\u0000\u0000\u0000\u009e\u03a6\u0001\u0000\u0000\u0000\u00a0\u03a9\u0001"+
		"\u0000\u0000\u0000\u00a2\u03ab\u0001\u0000\u0000\u0000\u00a4\u03ba\u0001"+
		"\u0000\u0000\u0000\u00a6\u03bc\u0001\u0000\u0000\u0000\u00a8\u03c4\u0001"+
		"\u0000\u0000\u0000\u00aa\u03cc\u0001\u0000\u0000\u0000\u00ac\u03cf\u0001"+
		"\u0000\u0000\u0000\u00ae\u03d1\u0001\u0000\u0000\u0000\u00b0\u03db\u0001"+
		"\u0000\u0000\u0000\u00b2\u03dd\u0001\u0000\u0000\u0000\u00b4\u03df\u0001"+
		"\u0000\u0000\u0000\u00b6\u03e2\u0001\u0000\u0000\u0000\u00b8\u03e7\u0001"+
		"\u0000\u0000\u0000\u00ba\u03e9\u0001\u0000\u0000\u0000\u00bc\u03f1\u0001"+
		"\u0000\u0000\u0000\u00be\u03f3\u0001\u0000\u0000\u0000\u00c0\u03f5\u0001"+
		"\u0000\u0000\u0000\u00c2\u03fd\u0001\u0000\u0000\u0000\u00c4\u0405\u0001"+
		"\u0000\u0000\u0000\u00c6\u040c\u0001\u0000\u0000\u0000\u00c8\u041b\u0001"+
		"\u0000\u0000\u0000\u00ca\u041d\u0001\u0000\u0000\u0000\u00cc\u041f\u0001"+
		"\u0000\u0000\u0000\u00ce\u0429\u0001\u0000\u0000\u0000\u00d0\u0438\u0001"+
		"\u0000\u0000\u0000\u00d2\u0441\u0001\u0000\u0000\u0000\u00d4\u0443\u0001"+
		"\u0000\u0000\u0000\u00d6\u0447\u0001\u0000\u0000\u0000\u00d8\u0449\u0001"+
		"\u0000\u0000\u0000\u00da\u044f\u0001\u0000\u0000\u0000\u00dc\u0451\u0001"+
		"\u0000\u0000\u0000\u00de\u0455\u0001\u0000\u0000\u0000\u00e0\u045d\u0001"+
		"\u0000\u0000\u0000\u00e2\u0467\u0001\u0000\u0000\u0000\u00e4\u046b\u0001"+
		"\u0000\u0000\u0000\u00e6\u046f\u0001\u0000\u0000\u0000\u00e8\u0473\u0001"+
		"\u0000\u0000\u0000\u00ea\u0475\u0001\u0000\u0000\u0000\u00ec\u047d\u0001"+
		"\u0000\u0000\u0000\u00ee\u047f\u0001\u0000\u0000\u0000\u00f0\u0481\u0001"+
		"\u0000\u0000\u0000\u00f2\u0489\u0001\u0000\u0000\u0000\u00f4\u0491\u0001"+
		"\u0000\u0000\u0000\u00f6\u0493\u0001\u0000\u0000\u0000\u00f8\u04a7\u0001"+
		"\u0000\u0000\u0000\u00fa\u04a9\u0001\u0000\u0000\u0000\u00fc\u04b5\u0001"+
		"\u0000\u0000\u0000\u00fe\u04b7\u0001\u0000\u0000\u0000\u0100\u04b9\u0001"+
		"\u0000\u0000\u0000\u0102\u04bd\u0001\u0000\u0000\u0000\u0104\u04c5\u0001"+
		"\u0000\u0000\u0000\u0106\u04ce\u0001\u0000\u0000\u0000\u0108\u04d0\u0001"+
		"\u0000\u0000\u0000\u010a\u04d3\u0001\u0000\u0000\u0000\u010c\u04dd\u0001"+
		"\u0000\u0000\u0000\u010e\u04e6\u0001\u0000\u0000\u0000\u0110\u04e8\u0001"+
		"\u0000\u0000\u0000\u0112\u05ea\u0001\u0000\u0000\u0000\u0114\u05ec\u0001"+
		"\u0000\u0000\u0000\u0116\u05f7\u0001\u0000\u0000\u0000\u0118\u05fc\u0001"+
		"\u0000\u0000\u0000\u011a\u0607\u0001\u0000\u0000\u0000\u011c\u0614\u0001"+
		"\u0000\u0000\u0000\u011e\u0617\u0001\u0000\u0000\u0000\u0120\u0663\u0001"+
		"\u0000\u0000\u0000\u0122\u0665\u0001\u0000\u0000\u0000\u0124\u0669\u0001"+
		"\u0000\u0000\u0000\u0126\u0672\u0001\u0000\u0000\u0000\u0128\u0674\u0001"+
		"\u0000\u0000\u0000\u012a\u0676\u0001\u0000\u0000\u0000\u012c\u0678\u0001"+
		"\u0000\u0000\u0000\u012e\u067a\u0001\u0000\u0000\u0000\u0130\u067c\u0001"+
		"\u0000\u0000\u0000\u0132\u067f\u0001\u0000\u0000\u0000\u0134\u0687\u0001"+
		"\u0000\u0000\u0000\u0136\u0689\u0001\u0000\u0000\u0000\u0138\u068b\u0001"+
		"\u0000\u0000\u0000\u013a\u068d\u0001\u0000\u0000\u0000\u013c\u068f\u0001"+
		"\u0000\u0000\u0000\u013e\u0141\u0003\u0002\u0001\u0000\u013f\u0141\u0003"+
		">\u001f\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u013f\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u0000"+
		"\u0000\u0001\u0143\u0001\u0001\u0000\u0000\u0000\u0144\u0149\u0003\u0004"+
		"\u0002\u0000\u0145\u014a\u0003\n\u0005\u0000\u0146\u014a\u0003\u0016\u000b"+
		"\u0000\u0147\u014a\u0003\u0018\f\u0000\u0148\u014a\u0003\u001a\r\u0000"+
		"\u0149\u0145\u0001\u0000\u0000\u0000\u0149\u0146\u0001\u0000\u0000\u0000"+
		"\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u0148\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0003<\u001e\u0000\u014c"+
		"\u0003\u0001\u0000\u0000\u0000\u014d\u0150\u0003\u0006\u0003\u0000\u014e"+
		"\u0150\u0003\b\u0004\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u014e"+
		"\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u014f"+
		"\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0005"+
		"\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0005\u001e\u0000\u0000\u0155\u0156\u0003\u0138\u009c\u0000\u0156\u0007"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0005\u001f\u0000\u0000\u0158\u0159"+
		"\u0005\u008f\u0000\u0000\u0159\u015a\u0003\u0138\u009c\u0000\u015a\t\u0001"+
		"\u0000\u0000\u0000\u015b\u015f\u0003\u000e\u0007\u0000\u015c\u015e\u0003"+
		"\u001c\u000e\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u0161\u0001"+
		"\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001"+
		"\u0000\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015f\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0003$\u0012\u0000\u0163\u0164\u0003&\u0013"+
		"\u0000\u0164\u000b\u0001\u0000\u0000\u0000\u0165\u0166\u0003\u000e\u0007"+
		"\u0000\u0166\u0167\u0003$\u0012\u0000\u0167\u0168\u0003&\u0013\u0000\u0168"+
		"\u0169\u0003<\u001e\u0000\u0169\r\u0001\u0000\u0000\u0000\u016a\u016c"+
		"\u0005 \u0000\u0000\u016b\u016d\u0007\u0000\u0000\u0000\u016c\u016b\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u0174\u0001"+
		"\u0000\u0000\u0000\u016e\u0170\u0003\u0010\b\u0000\u016f\u016e\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000"+
		"\u0000\u0000\u0173\u0175\u0005\u0001\u0000\u0000\u0174\u016f\u0001\u0000"+
		"\u0000\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0175\u000f\u0001\u0000"+
		"\u0000\u0000\u0176\u0179\u0003\u00eau\u0000\u0177\u0179\u0003\u0012\t"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0177\u0001\u0000\u0000"+
		"\u0000\u0179\u0011\u0001\u0000\u0000\u0000\u017a\u017b\u0005\u0002\u0000"+
		"\u0000\u017b\u017c\u0003\u0014\n\u0000\u017c\u017d\u0005\u0003\u0000\u0000"+
		"\u017d\u0013\u0001\u0000\u0000\u0000\u017e\u017f\u0003\u00eew\u0000\u017f"+
		"\u0180\u0005#\u0000\u0000\u0180\u0181\u0003\u00eau\u0000\u0181\u0015\u0001"+
		"\u0000\u0000\u0000\u0182\u019a\u0005$\u0000\u0000\u0183\u0187\u0003\u009a"+
		"M\u0000\u0184\u0186\u0003\u001c\u000e\u0000\u0185\u0184\u0001\u0000\u0000"+
		"\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018a\u0001\u0000\u0000"+
		"\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018b\u0003$\u0012\u0000"+
		"\u018b\u018c\u0003&\u0013\u0000\u018c\u019b\u0001\u0000\u0000\u0000\u018d"+
		"\u018f\u0003\u001c\u000e\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f"+
		"\u0192\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0001\u0000\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192"+
		"\u0190\u0001\u0000\u0000\u0000\u0193\u0194\u0005%\u0000\u0000\u0194\u0196"+
		"\u0005\u0004\u0000\u0000\u0195\u0197\u0003l6\u0000\u0196\u0195\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0005\u0005\u0000\u0000\u0199\u019b\u0003&\u0013"+
		"\u0000\u019a\u0183\u0001\u0000\u0000\u0000\u019a\u0190\u0001\u0000\u0000"+
		"\u0000\u019b\u0017\u0001\u0000\u0000\u0000\u019c\u01a3\u0005&\u0000\u0000"+
		"\u019d\u019f\u0003\u00e8t\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019f"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a4\u0005\u0001\u0000\u0000\u01a3\u019e\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a8\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a7\u0003\u001c\u000e\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7"+
		"\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ad\u0003$\u0012\u0000\u01ac\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0003&\u0013\u0000\u01af\u0019\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b4\u0005\'\u0000\u0000\u01b1\u01b3\u0003\u001c"+
		"\u000e\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u0003$\u0012\u0000\u01b8\u01b9\u0003&\u0013\u0000"+
		"\u01b9\u001b\u0001\u0000\u0000\u0000\u01ba\u01bd\u0005(\u0000\u0000\u01bb"+
		"\u01be\u0003\u001e\u000f\u0000\u01bc\u01be\u0003 \u0010\u0000\u01bd\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be\u001d"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c0\u0003\"\u0011\u0000\u01c0\u001f\u0001"+
		"\u0000\u0000\u0000\u01c1\u01c2\u0005)\u0000\u0000\u01c2\u01c3\u0003\""+
		"\u0011\u0000\u01c3!\u0001\u0000\u0000\u0000\u01c4\u01c5\u0003\u0132\u0099"+
		"\u0000\u01c5#\u0001\u0000\u0000\u0000\u01c6\u01c8\u0005%\u0000\u0000\u01c7"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca\u0003n7\u0000\u01ca%\u0001"+
		"\u0000\u0000\u0000\u01cb\u01cd\u0003(\u0014\u0000\u01cc\u01cb\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01cf\u0001\u0000"+
		"\u0000\u0000\u01ce\u01d0\u0003,\u0016\u0000\u01cf\u01ce\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d3\u00030\u0018\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d6\u00034\u001a\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d6\'\u0001\u0000\u0000\u0000\u01d7\u01d9"+
		"\u0005*\u0000\u0000\u01d8\u01da\u0003*\u0015\u0000\u01d9\u01d8\u0001\u0000"+
		"\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000"+
		"\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc)\u0001\u0000\u0000"+
		"\u0000\u01dd\u01e9\u0003\u0112\u0089\u0000\u01de\u01e9\u0003\u0094J\u0000"+
		"\u01df\u01e0\u0005\u0002\u0000\u0000\u01e0\u01e3\u0003\u00eew\u0000\u01e1"+
		"\u01e2\u0005#\u0000\u0000\u01e2\u01e4\u0003\u00eau\u0000\u01e3\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e6\u0005\u0003\u0000\u0000\u01e6\u01e9\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e9\u0003\u00eau\u0000\u01e8\u01dd\u0001\u0000"+
		"\u0000\u0000\u01e8\u01de\u0001\u0000\u0000\u0000\u01e8\u01df\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9+\u0001\u0000\u0000"+
		"\u0000\u01ea\u01ec\u0005,\u0000\u0000\u01eb\u01ed\u0003.\u0017\u0000\u01ec"+
		"\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef"+
		"-\u0001\u0000\u0000\u0000\u01f0\u01f1\u0003\u0092I\u0000\u01f1/\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f5\u0005-\u0000\u0000\u01f3\u01f5\u0005.\u0000"+
		"\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f7\u0001\u0000\u0000\u0000\u01f6\u01f8\u00032\u0019\u0000"+
		"\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000"+
		"\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fa1\u0001\u0000\u0000\u0000\u01fb\u01fc\u0007\u0001\u0000\u0000\u01fc"+
		"\u0202\u0003\u0110\u0088\u0000\u01fd\u0200\u0003\u0092I\u0000\u01fe\u0200"+
		"\u0003\u00eau\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u01fe\u0001"+
		"\u0000\u0000\u0000\u0200\u0202\u0001\u0000\u0000\u0000\u0201\u01fb\u0001"+
		"\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u02023\u0001\u0000"+
		"\u0000\u0000\u0203\u0205\u00036\u001b\u0000\u0204\u0206\u00038\u001c\u0000"+
		"\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000"+
		"\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u0209\u0003:\u001d\u0000\u0208"+
		"\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209"+
		"\u022e\u0001\u0000\u0000\u0000\u020a\u020c\u00036\u001b\u0000\u020b\u020d"+
		"\u0003:\u001d\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020c\u020d\u0001"+
		"\u0000\u0000\u0000\u020d\u020f\u0001\u0000\u0000\u0000\u020e\u0210\u0003"+
		"8\u001c\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000"+
		"\u0000\u0000\u0210\u022e\u0001\u0000\u0000\u0000\u0211\u0213\u00038\u001c"+
		"\u0000\u0212\u0214\u00036\u001b\u0000\u0213\u0212\u0001\u0000\u0000\u0000"+
		"\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0216\u0001\u0000\u0000\u0000"+
		"\u0215\u0217\u0003:\u001d\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u0216"+
		"\u0217\u0001\u0000\u0000\u0000\u0217\u022e\u0001\u0000\u0000\u0000\u0218"+
		"\u021a\u00038\u001c\u0000\u0219\u021b\u0003:\u001d\u0000\u021a\u0219\u0001"+
		"\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021d\u0001"+
		"\u0000\u0000\u0000\u021c\u021e\u00036\u001b\u0000\u021d\u021c\u0001\u0000"+
		"\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u022e\u0001\u0000"+
		"\u0000\u0000\u021f\u0221\u0003:\u001d\u0000\u0220\u0222\u00038\u001c\u0000"+
		"\u0221\u0220\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000"+
		"\u0222\u0224\u0001\u0000\u0000\u0000\u0223\u0225\u00036\u001b\u0000\u0224"+
		"\u0223\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225"+
		"\u022e\u0001\u0000\u0000\u0000\u0226\u0228\u0003:\u001d\u0000\u0227\u0229"+
		"\u00036\u001b\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0228\u0229\u0001"+
		"\u0000\u0000\u0000\u0229\u022b\u0001\u0000\u0000\u0000\u022a\u022c\u0003"+
		"8\u001c\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000"+
		"\u0000\u0000\u022c\u022e\u0001\u0000\u0000\u0000\u022d\u0203\u0001\u0000"+
		"\u0000\u0000\u022d\u020a\u0001\u0000\u0000\u0000\u022d\u0211\u0001\u0000"+
		"\u0000\u0000\u022d\u0218\u0001\u0000\u0000\u0000\u022d\u021f\u0001\u0000"+
		"\u0000\u0000\u022d\u0226\u0001\u0000\u0000\u0000\u022e5\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u00051\u0000\u0000\u0230\u0231\u0003\u00d4j\u0000\u0231"+
		"7\u0001\u0000\u0000\u0000\u0232\u0233\u00052\u0000\u0000\u0233\u0234\u0003"+
		"\u00d4j\u0000\u02349\u0001\u0000\u0000\u0000\u0235\u0236\u00053\u0000"+
		"\u0000\u0236\u0237\u0003\u00d4j\u0000\u0237;\u0001\u0000\u0000\u0000\u0238"+
		"\u0239\u00054\u0000\u0000\u0239\u023b\u0003\u0082A\u0000\u023a\u0238\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b=\u0001\u0000"+
		"\u0000\u0000\u023c\u0242\u0003\u0004\u0002\u0000\u023d\u0240\u0003@ \u0000"+
		"\u023e\u023f\u0005\u0006\u0000\u0000\u023f\u0241\u0003>\u001f\u0000\u0240"+
		"\u023e\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241"+
		"\u0243\u0001\u0000\u0000\u0000\u0242\u023d\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0001\u0000\u0000\u0000\u0243?\u0001\u0000\u0000\u0000\u0244\u0250"+
		"\u0003B!\u0000\u0245\u0250\u0003D\"\u0000\u0246\u0250\u0003F#\u0000\u0247"+
		"\u0250\u0003J%\u0000\u0248\u0250\u0003L&\u0000\u0249\u0250\u0003N\'\u0000"+
		"\u024a\u0250\u0003H$\u0000\u024b\u0250\u0003P(\u0000\u024c\u0250\u0003"+
		"R)\u0000\u024d\u0250\u0003T*\u0000\u024e\u0250\u0003V+\u0000\u024f\u0244"+
		"\u0001\u0000\u0000\u0000\u024f\u0245\u0001\u0000\u0000\u0000\u024f\u0246"+
		"\u0001\u0000\u0000\u0000\u024f\u0247\u0001\u0000\u0000\u0000\u024f\u0248"+
		"\u0001\u0000\u0000\u0000\u024f\u0249\u0001\u0000\u0000\u0000\u024f\u024a"+
		"\u0001\u0000\u0000\u0000\u024f\u024b\u0001\u0000\u0000\u0000\u024f\u024c"+
		"\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f\u024e"+
		"\u0001\u0000\u0000\u0000\u0250A\u0001\u0000\u0000\u0000\u0251\u0253\u0005"+
		"5\u0000\u0000\u0252\u0254\u00056\u0000\u0000\u0253\u0252\u0001\u0000\u0000"+
		"\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000"+
		"\u0000\u0255\u0258\u0003\u0132\u0099\u0000\u0256\u0257\u00057\u0000\u0000"+
		"\u0257\u0259\u0003`0\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0258\u0259"+
		"\u0001\u0000\u0000\u0000\u0259C\u0001\u0000\u0000\u0000\u025a\u025c\u0005"+
		"8\u0000\u0000\u025b\u025d\u00056\u0000\u0000\u025c\u025b\u0001\u0000\u0000"+
		"\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000"+
		"\u0000\u025e\u025f\u0003b1\u0000\u025fE\u0001\u0000\u0000\u0000\u0260"+
		"\u0262\u00059\u0000\u0000\u0261\u0263\u00056\u0000\u0000\u0262\u0261\u0001"+
		"\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0264\u0001"+
		"\u0000\u0000\u0000\u0264\u0265\u0003b1\u0000\u0265G\u0001\u0000\u0000"+
		"\u0000\u0266\u0268\u0005:\u0000\u0000\u0267\u0269\u00056\u0000\u0000\u0268"+
		"\u0267\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269"+
		"\u026a\u0001\u0000\u0000\u0000\u026a\u026b\u0003`0\u0000\u026bI\u0001"+
		"\u0000\u0000\u0000\u026c\u026e\u0005;\u0000\u0000\u026d\u026f\u00056\u0000"+
		"\u0000\u026e\u026d\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000"+
		"\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0271\u0003^/\u0000\u0271"+
		"\u0272\u0005<\u0000\u0000\u0272\u0273\u0003^/\u0000\u0273K\u0001\u0000"+
		"\u0000\u0000\u0274\u0276\u0005>\u0000\u0000\u0275\u0277\u00056\u0000\u0000"+
		"\u0276\u0275\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000"+
		"\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0003^/\u0000\u0279\u027a"+
		"\u0005<\u0000\u0000\u027a\u027b\u0003^/\u0000\u027bM\u0001\u0000\u0000"+
		"\u0000\u027c\u027e\u0005?\u0000\u0000\u027d\u027f\u00056\u0000\u0000\u027e"+
		"\u027d\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f"+
		"\u0280\u0001\u0000\u0000\u0000\u0280\u0281\u0003^/\u0000\u0281\u0282\u0005"+
		"<\u0000\u0000\u0282\u0283\u0003^/\u0000\u0283O\u0001\u0000\u0000\u0000"+
		"\u0284\u0285\u0005@\u0000\u0000\u0285\u0286\u0005=\u0000\u0000\u0286\u0287"+
		"\u0003f3\u0000\u0287Q\u0001\u0000\u0000\u0000\u0288\u0289\u0005A\u0000"+
		"\u0000\u0289\u028a\u0005=\u0000\u0000\u028a\u028b\u0003f3\u0000\u028b"+
		"S\u0001\u0000\u0000\u0000\u028c\u028d\u0005A\u0000\u0000\u028d\u028e\u0005"+
		"%\u0000\u0000\u028e\u028f\u0003d2\u0000\u028fU\u0001\u0000\u0000\u0000"+
		"\u0290\u0291\u0005B\u0000\u0000\u0291\u0293\u0003\u0132\u0099\u0000\u0292"+
		"\u0290\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293"+
		"\u0299\u0001\u0000\u0000\u0000\u0294\u0296\u0003X,\u0000\u0295\u0297\u0003"+
		"Z-\u0000\u0296\u0295\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000"+
		"\u0000\u0297\u029a\u0001\u0000\u0000\u0000\u0298\u029a\u0003Z-\u0000\u0299"+
		"\u0294\u0001\u0000\u0000\u0000\u0299\u0298\u0001\u0000\u0000\u0000\u029a"+
		"\u029e\u0001\u0000\u0000\u0000\u029b\u029d\u0003\\.\u0000\u029c\u029b"+
		"\u0001\u0000\u0000\u0000\u029d\u02a0\u0001\u0000\u0000\u0000\u029e\u029c"+
		"\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a1\u02a2"+
		"\u0005%\u0000\u0000\u02a2\u02a3\u0003n7\u0000\u02a3W\u0001\u0000\u0000"+
		"\u0000\u02a4\u02a5\u0005A\u0000\u0000\u02a5\u02a6\u0003d2\u0000\u02a6"+
		"Y\u0001\u0000\u0000\u0000\u02a7\u02a8\u0005@\u0000\u0000\u02a8\u02a9\u0003"+
		"d2\u0000\u02a9[\u0001\u0000\u0000\u0000\u02aa\u02ae\u0005C\u0000\u0000"+
		"\u02ab\u02af\u0003\u0132\u0099\u0000\u02ac\u02ad\u0005)\u0000\u0000\u02ad"+
		"\u02af\u0003\u0132\u0099\u0000\u02ae\u02ab\u0001\u0000\u0000\u0000\u02ae"+
		"\u02ac\u0001\u0000\u0000\u0000\u02af]\u0001\u0000\u0000\u0000\u02b0\u02b6"+
		"\u0005D\u0000\u0000\u02b1\u02b3\u0005E\u0000\u0000\u02b2\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b6\u0003\u0132\u0099\u0000\u02b5\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b5\u02b2\u0001\u0000\u0000\u0000\u02b6_\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b8\u0005E\u0000\u0000\u02b8\u02b9\u0003\u0132\u0099\u0000"+
		"\u02b9a\u0001\u0000\u0000\u0000\u02ba\u02bf\u0003`0\u0000\u02bb\u02bf"+
		"\u0005D\u0000\u0000\u02bc\u02bf\u0005)\u0000\u0000\u02bd\u02bf\u0005F"+
		"\u0000\u0000\u02be\u02ba\u0001\u0000\u0000\u0000\u02be\u02bb\u0001\u0000"+
		"\u0000\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02be\u02bd\u0001\u0000"+
		"\u0000\u0000\u02bfc\u0001\u0000\u0000\u0000\u02c0\u02c1\u0005\u0004\u0000"+
		"\u0000\u02c1\u02c2\u0003h4\u0000\u02c2\u02c3\u0005\u0005\u0000\u0000\u02c3"+
		"e\u0001\u0000\u0000\u0000\u02c4\u02c5\u0005\u0004\u0000\u0000\u02c5\u02c6"+
		"\u0003h4\u0000\u02c6\u02c7\u0005\u0005\u0000\u0000\u02c7g\u0001\u0000"+
		"\u0000\u0000\u02c8\u02ca\u0003l6\u0000\u02c9\u02c8\u0001\u0000\u0000\u0000"+
		"\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u02d4\u0001\u0000\u0000\u0000"+
		"\u02cb\u02cd\u0003j5\u0000\u02cc\u02ce\u0005\u0007\u0000\u0000\u02cd\u02cc"+
		"\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02d0"+
		"\u0001\u0000\u0000\u0000\u02cf\u02d1\u0003l6\u0000\u02d0\u02cf\u0001\u0000"+
		"\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d3\u0001\u0000"+
		"\u0000\u0000\u02d2\u02cb\u0001\u0000\u0000\u0000\u02d3\u02d6\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000"+
		"\u0000\u0000\u02d5i\u0001\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d7\u02d8\u0005E\u0000\u0000\u02d8\u02d9\u0003\u00e8t\u0000\u02d9"+
		"\u02db\u0005\u0004\u0000\u0000\u02da\u02dc\u0003l6\u0000\u02db\u02da\u0001"+
		"\u0000\u0000\u0000\u02db\u02dc\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001"+
		"\u0000\u0000\u0000\u02dd\u02de\u0005\u0005\u0000\u0000\u02dek\u0001\u0000"+
		"\u0000\u0000\u02df\u02e4\u0003\u009eO\u0000\u02e0\u02e1\u0005\u0007\u0000"+
		"\u0000\u02e1\u02e3\u0003\u009eO\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e6\u0001\u0000\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000"+
		"\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5\u02e8\u0001\u0000\u0000\u0000"+
		"\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e7\u02e9\u0005\u0007\u0000\u0000"+
		"\u02e8\u02e7\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000"+
		"\u02e9m\u0001\u0000\u0000\u0000\u02ea\u02ed\u0005\u0004\u0000\u0000\u02eb"+
		"\u02ee\u0003\f\u0006\u0000\u02ec\u02ee\u0003p8\u0000\u02ed\u02eb\u0001"+
		"\u0000\u0000\u0000\u02ed\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001"+
		"\u0000\u0000\u0000\u02ef\u02f0\u0005\u0005\u0000\u0000\u02f0o\u0001\u0000"+
		"\u0000\u0000\u02f1\u02f3\u0003t:\u0000\u02f2\u02f1\u0001\u0000\u0000\u0000"+
		"\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f7\u0001\u0000\u0000\u0000"+
		"\u02f4\u02f6\u0003r9\u0000\u02f5\u02f4\u0001\u0000\u0000\u0000\u02f6\u02f9"+
		"\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f8"+
		"\u0001\u0000\u0000\u0000\u02f8q\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001"+
		"\u0000\u0000\u0000\u02fa\u02fc\u0003v;\u0000\u02fb\u02fd\u0005\u0007\u0000"+
		"\u0000\u02fc\u02fb\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000"+
		"\u0000\u02fd\u02ff\u0001\u0000\u0000\u0000\u02fe\u0300\u0003t:\u0000\u02ff"+
		"\u02fe\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300"+
		"s\u0001\u0000\u0000\u0000\u0301\u0306\u0003\u00aaU\u0000\u0302\u0304\u0005"+
		"\u0007\u0000\u0000\u0303\u0305\u0003t:\u0000\u0304\u0303\u0001\u0000\u0000"+
		"\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305\u0307\u0001\u0000\u0000"+
		"\u0000\u0306\u0302\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000"+
		"\u0000\u0307u\u0001\u0000\u0000\u0000\u0308\u0311\u0003\u008eG\u0000\u0309"+
		"\u0311\u0003x<\u0000\u030a\u0311\u0003\u008cF\u0000\u030b\u0311\u0003"+
		"z=\u0000\u030c\u0311\u0003|>\u0000\u030d\u0311\u0003\u0090H\u0000\u030e"+
		"\u0311\u0003~?\u0000\u030f\u0311\u0003\u0080@\u0000\u0310\u0308\u0001"+
		"\u0000\u0000\u0000\u0310\u0309\u0001\u0000\u0000\u0000\u0310\u030a\u0001"+
		"\u0000\u0000\u0000\u0310\u030b\u0001\u0000\u0000\u0000\u0310\u030c\u0001"+
		"\u0000\u0000\u0000\u0310\u030d\u0001\u0000\u0000\u0000\u0310\u030e\u0001"+
		"\u0000\u0000\u0000\u0310\u030f\u0001\u0000\u0000\u0000\u0311w\u0001\u0000"+
		"\u0000\u0000\u0312\u0313\u0005G\u0000\u0000\u0313\u0314\u0003n7\u0000"+
		"\u0314y\u0001\u0000\u0000\u0000\u0315\u0316\u0005E\u0000\u0000\u0316\u0317"+
		"\u0003\u00e8t\u0000\u0317\u0318\u0003n7\u0000\u0318{\u0001\u0000\u0000"+
		"\u0000\u0319\u031b\u0005H\u0000\u0000\u031a\u031c\u00056\u0000\u0000\u031b"+
		"\u031a\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c"+
		"\u031d\u0001\u0000\u0000\u0000\u031d\u031e\u0003\u00e8t\u0000\u031e\u031f"+
		"\u0003n7\u0000\u031f}\u0001\u0000\u0000\u0000\u0320\u0321\u0005I\u0000"+
		"\u0000\u0321\u0322\u0005\u0002\u0000\u0000\u0322\u0323\u0003\u00eew\u0000"+
		"\u0323\u0324\u0005#\u0000\u0000\u0324\u0325\u0003\u00eau\u0000\u0325\u0326"+
		"\u0005\u0003\u0000\u0000\u0326\u007f\u0001\u0000\u0000\u0000\u0327\u0328"+
		"\u00054\u0000\u0000\u0328\u0329\u0003\u0082A\u0000\u0329\u0081\u0001\u0000"+
		"\u0000\u0000\u032a\u032d\u0003\u0084B\u0000\u032b\u032d\u0003\u0086C\u0000"+
		"\u032c\u032a\u0001\u0000\u0000\u0000\u032c\u032b\u0001\u0000\u0000\u0000"+
		"\u032d\u0083\u0001\u0000\u0000\u0000\u032e\u032f\u0003\u00eau\u0000\u032f"+
		"\u0333\u0005\u0004\u0000\u0000\u0330\u0332\u0003\u008aE\u0000\u0331\u0330"+
		"\u0001\u0000\u0000\u0000\u0332\u0335\u0001\u0000\u0000\u0000\u0333\u0331"+
		"\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000\u0000\u0000\u0334\u0336"+
		"\u0001\u0000\u0000\u0000\u0335\u0333\u0001\u0000\u0000\u0000\u0336\u0337"+
		"\u0005\u0005\u0000\u0000\u0337\u0085\u0001\u0000\u0000\u0000\u0338\u0342"+
		"\u0005\u00a5\u0000\u0000\u0339\u033d\u0005\u0002\u0000\u0000\u033a\u033c"+
		"\u0003\u00eau\u0000\u033b\u033a\u0001\u0000\u0000\u0000\u033c\u033f\u0001"+
		"\u0000\u0000\u0000\u033d\u033b\u0001\u0000\u0000\u0000\u033d\u033e\u0001"+
		"\u0000\u0000\u0000\u033e\u0340\u0001\u0000\u0000\u0000\u033f\u033d\u0001"+
		"\u0000\u0000\u0000\u0340\u0342\u0005\u0003\u0000\u0000\u0341\u0338\u0001"+
		"\u0000\u0000\u0000\u0341\u0339\u0001\u0000\u0000\u0000\u0342\u0343\u0001"+
		"\u0000\u0000\u0000\u0343\u0347\u0005\u0004\u0000\u0000\u0344\u0346\u0003"+
		"\u0088D\u0000\u0345\u0344\u0001\u0000\u0000\u0000\u0346\u0349\u0001\u0000"+
		"\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000"+
		"\u0000\u0000\u0348\u034a\u0001\u0000\u0000\u0000\u0349\u0347\u0001\u0000"+
		"\u0000\u0000\u034a\u034b\u0005\u0005\u0000\u0000\u034b\u0087\u0001\u0000"+
		"\u0000\u0000\u034c\u0350\u0005\u0002\u0000\u0000\u034d\u034f\u0003\u008a"+
		"E\u0000\u034e\u034d\u0001\u0000\u0000\u0000\u034f\u0352\u0001\u0000\u0000"+
		"\u0000\u0350\u034e\u0001\u0000\u0000\u0000\u0350\u0351\u0001\u0000\u0000"+
		"\u0000\u0351\u0353\u0001\u0000\u0000\u0000\u0352\u0350\u0001\u0000\u0000"+
		"\u0000\u0353\u0356\u0005\u0003\u0000\u0000\u0354\u0356\u0005\u00a5\u0000"+
		"\u0000\u0355\u034c\u0001\u0000\u0000\u0000\u0355\u0354\u0001\u0000\u0000"+
		"\u0000\u0356\u0089\u0001\u0000\u0000\u0000\u0357\u035d\u0003\u0132\u0099"+
		"\u0000\u0358\u035d\u0003\u0124\u0092\u0000\u0359\u035d\u0003\u0126\u0093"+
		"\u0000\u035a\u035d\u0003\u012e\u0097\u0000\u035b\u035d\u0005J\u0000\u0000"+
		"\u035c\u0357\u0001\u0000\u0000\u0000\u035c\u0358\u0001\u0000\u0000\u0000"+
		"\u035c\u0359\u0001\u0000\u0000\u0000\u035c\u035a\u0001\u0000\u0000\u0000"+
		"\u035c\u035b\u0001\u0000\u0000\u0000\u035d\u008b\u0001\u0000\u0000\u0000"+
		"\u035e\u035f\u0005K\u0000\u0000\u035f\u0360\u0003n7\u0000\u0360\u008d"+
		"\u0001\u0000\u0000\u0000\u0361\u0366\u0003n7\u0000\u0362\u0363\u0005L"+
		"\u0000\u0000\u0363\u0365\u0003n7\u0000\u0364\u0362\u0001\u0000\u0000\u0000"+
		"\u0365\u0368\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000\u0000\u0000"+
		"\u0366\u0367\u0001\u0000\u0000\u0000\u0367\u008f\u0001\u0000\u0000\u0000"+
		"\u0368\u0366\u0001\u0000\u0000\u0000\u0369\u036a\u0005M\u0000\u0000\u036a"+
		"\u036b\u0003\u0092I\u0000\u036b\u0091\u0001\u0000\u0000\u0000\u036c\u0370"+
		"\u0003\u0110\u0088\u0000\u036d\u0370\u0003\u0112\u0089\u0000\u036e\u0370"+
		"\u0003\u0094J\u0000\u036f\u036c\u0001\u0000\u0000\u0000\u036f\u036d\u0001"+
		"\u0000\u0000\u0000\u036f\u036e\u0001\u0000\u0000\u0000\u0370\u0093\u0001"+
		"\u0000\u0000\u0000\u0371\u0372\u0003\u0132\u0099\u0000\u0372\u0373\u0003"+
		"\u0096K\u0000\u0373\u0095\u0001\u0000\u0000\u0000\u0374\u0384\u0005\u00a5"+
		"\u0000\u0000\u0375\u0377\u0005\u0002\u0000\u0000\u0376\u0378\u0005!\u0000"+
		"\u0000\u0377\u0376\u0001\u0000\u0000\u0000\u0377\u0378\u0001\u0000\u0000"+
		"\u0000\u0378\u0379\u0001\u0000\u0000\u0000\u0379\u037e\u0003\u00eew\u0000"+
		"\u037a\u037b\u0005\b\u0000\u0000\u037b\u037d\u0003\u00eew\u0000\u037c"+
		"\u037a\u0001\u0000\u0000\u0000\u037d\u0380\u0001\u0000\u0000\u0000\u037e"+
		"\u037c\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000\u037f"+
		"\u0381\u0001\u0000\u0000\u0000\u0380\u037e\u0001\u0000\u0000\u0000\u0381"+
		"\u0382\u0005\u0003\u0000\u0000\u0382\u0384\u0001\u0000\u0000\u0000\u0383"+
		"\u0374\u0001\u0000\u0000\u0000\u0383\u0375\u0001\u0000\u0000\u0000\u0384"+
		"\u0097\u0001\u0000\u0000\u0000\u0385\u0392\u0005\u00a5\u0000\u0000\u0386"+
		"\u0387\u0005\u0002\u0000\u0000\u0387\u038c\u0003\u00eew\u0000\u0388\u0389"+
		"\u0005\b\u0000\u0000\u0389\u038b\u0003\u00eew\u0000\u038a\u0388\u0001"+
		"\u0000\u0000\u0000\u038b\u038e\u0001\u0000\u0000\u0000\u038c\u038a\u0001"+
		"\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000\u0000\u038d\u038f\u0001"+
		"\u0000\u0000\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038f\u0390\u0005"+
		"\u0003\u0000\u0000\u0390\u0392\u0001\u0000\u0000\u0000\u0391\u0385\u0001"+
		"\u0000\u0000\u0000\u0391\u0386\u0001\u0000\u0000\u0000\u0392\u0099\u0001"+
		"\u0000\u0000\u0000\u0393\u0395\u0005\u0004\u0000\u0000\u0394\u0396\u0003"+
		"\u009cN\u0000\u0395\u0394\u0001\u0000\u0000\u0000\u0395\u0396\u0001\u0000"+
		"\u0000\u0000\u0396\u0397\u0001\u0000\u0000\u0000\u0397\u0398\u0005\u0005"+
		"\u0000\u0000\u0398\u009b\u0001\u0000\u0000\u0000\u0399\u039e\u0003\u009e"+
		"O\u0000\u039a\u039c\u0005\u0007\u0000\u0000\u039b\u039d\u0003\u009cN\u0000"+
		"\u039c\u039b\u0001\u0000\u0000\u0000\u039c\u039d\u0001\u0000\u0000\u0000"+
		"\u039d\u039f\u0001\u0000\u0000\u0000\u039e\u039a\u0001\u0000\u0000\u0000"+
		"\u039e\u039f\u0001\u0000\u0000\u0000\u039f\u009d\u0001\u0000\u0000\u0000"+
		"\u03a0\u03a1\u0003\u00e6s\u0000\u03a1\u03a2\u0003\u00a2Q\u0000\u03a2\u03a7"+
		"\u0001\u0000\u0000\u0000\u03a3\u03a4\u0003\u00d6k\u0000\u03a4\u03a5\u0003"+
		"\u00a0P\u0000\u03a5\u03a7\u0001\u0000\u0000\u0000\u03a6\u03a0\u0001\u0000"+
		"\u0000\u0000\u03a6\u03a3\u0001\u0000\u0000\u0000\u03a7\u009f\u0001\u0000"+
		"\u0000\u0000\u03a8\u03aa\u0003\u00a2Q\u0000\u03a9\u03a8\u0001\u0000\u0000"+
		"\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u00a1\u0001\u0000\u0000"+
		"\u0000\u03ab\u03ac\u0003\u00a4R\u0000\u03ac\u03b5\u0003\u00a6S\u0000\u03ad"+
		"\u03b1\u0005\u0006\u0000\u0000\u03ae\u03af\u0003\u00a4R\u0000\u03af\u03b0"+
		"\u0003\u00a6S\u0000\u03b0\u03b2\u0001\u0000\u0000\u0000\u03b1\u03ae\u0001"+
		"\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2\u03b4\u0001"+
		"\u0000\u0000\u0000\u03b3\u03ad\u0001\u0000\u0000\u0000\u03b4\u03b7\u0001"+
		"\u0000\u0000\u0000\u03b5\u03b3\u0001\u0000\u0000\u0000\u03b5\u03b6\u0001"+
		"\u0000\u0000\u0000\u03b6\u00a3\u0001\u0000\u0000\u0000\u03b7\u03b5\u0001"+
		"\u0000\u0000\u0000\u03b8\u03bb\u0003\u00e8t\u0000\u03b9\u03bb\u0005\t"+
		"\u0000\u0000\u03ba\u03b8\u0001\u0000\u0000\u0000\u03ba\u03b9\u0001\u0000"+
		"\u0000\u0000\u03bb\u00a5\u0001\u0000\u0000\u0000\u03bc\u03c1\u0003\u00a8"+
		"T\u0000\u03bd\u03be\u0005\b\u0000\u0000\u03be\u03c0\u0003\u00a8T\u0000"+
		"\u03bf\u03bd\u0001\u0000\u0000\u0000\u03c0\u03c3\u0001\u0000\u0000\u0000"+
		"\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000\u0000"+
		"\u03c2\u00a7\u0001\u0000\u0000\u0000\u03c3\u03c1\u0001\u0000\u0000\u0000"+
		"\u03c4\u03c5\u0003\u00e2q\u0000\u03c5\u00a9\u0001\u0000\u0000\u0000\u03c6"+
		"\u03c7\u0003\u00e6s\u0000\u03c7\u03c8\u0003\u00aeW\u0000\u03c8\u03cd\u0001"+
		"\u0000\u0000\u0000\u03c9\u03ca\u0003\u00dam\u0000\u03ca\u03cb\u0003\u00ac"+
		"V\u0000\u03cb\u03cd\u0001\u0000\u0000\u0000\u03cc\u03c6\u0001\u0000\u0000"+
		"\u0000\u03cc\u03c9\u0001\u0000\u0000\u0000\u03cd\u00ab\u0001\u0000\u0000"+
		"\u0000\u03ce\u03d0\u0003\u00aeW\u0000\u03cf\u03ce\u0001\u0000\u0000\u0000"+
		"\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0\u00ad\u0001\u0000\u0000\u0000"+
		"\u03d1\u03d8\u0003\u00b6[\u0000\u03d2\u03d4\u0005\u0006\u0000\u0000\u03d3"+
		"\u03d5\u0003\u00b4Z\u0000\u03d4\u03d3\u0001\u0000\u0000\u0000\u03d4\u03d5"+
		"\u0001\u0000\u0000\u0000\u03d5\u03d7\u0001\u0000\u0000\u0000\u03d6\u03d2"+
		"\u0001\u0000\u0000\u0000\u03d7\u03da\u0001\u0000\u0000\u0000\u03d8\u03d6"+
		"\u0001\u0000\u0000\u0000\u03d8\u03d9\u0001\u0000\u0000\u0000\u03d9\u00af"+
		"\u0001\u0000\u0000\u0000\u03da\u03d8\u0001\u0000\u0000\u0000\u03db\u03dc"+
		"\u0003\u00be_\u0000\u03dc\u00b1\u0001\u0000\u0000\u0000\u03dd\u03de\u0003"+
		"\u00eau\u0000\u03de\u00b3\u0001\u0000\u0000\u0000\u03df\u03e0\u0003\u00b8"+
		"\\\u0000\u03e0\u03e1\u0003\u00a6S\u0000\u03e1\u00b5\u0001\u0000\u0000"+
		"\u0000\u03e2\u03e3\u0003\u00b8\\\u0000\u03e3\u03e4\u0003\u00ba]\u0000"+
		"\u03e4\u00b7\u0001\u0000\u0000\u0000\u03e5\u03e8\u0003\u00b0X\u0000\u03e6"+
		"\u03e8\u0003\u00b2Y\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000\u03e7\u03e6"+
		"\u0001\u0000\u0000\u0000\u03e8\u00b9\u0001\u0000\u0000\u0000\u03e9\u03ee"+
		"\u0003\u00bc^\u0000\u03ea\u03eb\u0005\b\u0000\u0000\u03eb\u03ed\u0003"+
		"\u00bc^\u0000\u03ec\u03ea\u0001\u0000\u0000\u0000\u03ed\u03f0\u0001\u0000"+
		"\u0000\u0000\u03ee\u03ec\u0001\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000"+
		"\u0000\u0000\u03ef\u00bb\u0001\u0000\u0000\u0000\u03f0\u03ee\u0001\u0000"+
		"\u0000\u0000\u03f1\u03f2\u0003\u00e4r\u0000\u03f2\u00bd\u0001\u0000\u0000"+
		"\u0000\u03f3\u03f4\u0003\u00c0`\u0000\u03f4\u00bf\u0001\u0000\u0000\u0000"+
		"\u03f5\u03fa\u0003\u00c2a\u0000\u03f6\u03f7\u0005\n\u0000\u0000\u03f7"+
		"\u03f9\u0003\u00c2a\u0000\u03f8\u03f6\u0001\u0000\u0000\u0000\u03f9\u03fc"+
		"\u0001\u0000\u0000\u0000\u03fa\u03f8\u0001\u0000\u0000\u0000\u03fa\u03fb"+
		"\u0001\u0000\u0000\u0000\u03fb\u00c1\u0001\u0000\u0000\u0000\u03fc\u03fa"+
		"\u0001\u0000\u0000\u0000\u03fd\u0402\u0003\u00c6c\u0000\u03fe\u03ff\u0005"+
		"\u000b\u0000\u0000\u03ff\u0401\u0003\u00c6c\u0000\u0400\u03fe\u0001\u0000"+
		"\u0000\u0000\u0401\u0404\u0001\u0000\u0000\u0000\u0402\u0400\u0001\u0000"+
		"\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000\u0403\u00c3\u0001\u0000"+
		"\u0000\u0000\u0404\u0402\u0001\u0000\u0000\u0000\u0405\u0407\u0003\u00ce"+
		"g\u0000\u0406\u0408\u0003\u00c8d\u0000\u0407\u0406\u0001\u0000\u0000\u0000"+
		"\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u00c5\u0001\u0000\u0000\u0000"+
		"\u0409\u040d\u0003\u00c4b\u0000\u040a\u040b\u0005\f\u0000\u0000\u040b"+
		"\u040d\u0003\u00c4b\u0000\u040c\u0409\u0001\u0000\u0000\u0000\u040c\u040a"+
		"\u0001\u0000\u0000\u0000\u040d\u00c7\u0001\u0000\u0000\u0000\u040e\u041c"+
		"\u0005\r\u0000\u0000\u040f\u041c\u0005\u0001\u0000\u0000\u0410\u041c\u0005"+
		"\u000e\u0000\u0000\u0411\u0412\u0005\u0004\u0000\u0000\u0412\u0417\u0003"+
		"\u00cae\u0000\u0413\u0415\u0005\b\u0000\u0000\u0414\u0416\u0003\u00cc"+
		"f\u0000\u0415\u0414\u0001\u0000\u0000\u0000\u0415\u0416\u0001\u0000\u0000"+
		"\u0000\u0416\u0418\u0001\u0000\u0000\u0000\u0417\u0413\u0001\u0000\u0000"+
		"\u0000\u0417\u0418\u0001\u0000\u0000\u0000\u0418\u0419\u0001\u0000\u0000"+
		"\u0000\u0419\u041a\u0005\u0005\u0000\u0000\u041a\u041c\u0001\u0000\u0000"+
		"\u0000\u041b\u040e\u0001\u0000\u0000\u0000\u041b\u040f\u0001\u0000\u0000"+
		"\u0000\u041b\u0410\u0001\u0000\u0000\u0000\u041b\u0411\u0001\u0000\u0000"+
		"\u0000\u041c\u00c9\u0001\u0000\u0000\u0000\u041d\u041e\u0003\u00d4j\u0000"+
		"\u041e\u00cb\u0001\u0000\u0000\u0000\u041f\u0420\u0003\u00d4j\u0000\u0420"+
		"\u00cd\u0001\u0000\u0000\u0000\u0421\u042a\u0003\u0132\u0099\u0000\u0422"+
		"\u042a\u0005\t\u0000\u0000\u0423\u0424\u0005\u000f\u0000\u0000\u0424\u042a"+
		"\u0003\u00d0h\u0000\u0425\u0426\u0005\u0002\u0000\u0000\u0426\u0427\u0003"+
		"\u00be_\u0000\u0427\u0428\u0005\u0003\u0000\u0000\u0428\u042a\u0001\u0000"+
		"\u0000\u0000\u0429\u0421\u0001\u0000\u0000\u0000\u0429\u0422\u0001\u0000"+
		"\u0000\u0000\u0429\u0423\u0001\u0000\u0000\u0000\u0429\u0425\u0001\u0000"+
		"\u0000\u0000\u042a\u00cf\u0001\u0000\u0000\u0000\u042b\u0439\u0003\u00d2"+
		"i\u0000\u042c\u0435\u0005\u0002\u0000\u0000\u042d\u0432\u0003\u00d2i\u0000"+
		"\u042e\u042f\u0005\n\u0000\u0000\u042f\u0431\u0003\u00d2i\u0000\u0430"+
		"\u042e\u0001\u0000\u0000\u0000\u0431\u0434\u0001\u0000\u0000\u0000\u0432"+
		"\u0430\u0001\u0000\u0000\u0000\u0432\u0433\u0001\u0000\u0000\u0000\u0433"+
		"\u0436\u0001\u0000\u0000\u0000\u0434\u0432\u0001\u0000\u0000\u0000\u0435"+
		"\u042d\u0001\u0000\u0000\u0000\u0435\u0436\u0001\u0000\u0000\u0000\u0436"+
		"\u0437\u0001\u0000\u0000\u0000\u0437\u0439\u0005\u0003\u0000\u0000\u0438"+
		"\u042b\u0001\u0000\u0000\u0000\u0438\u042c\u0001\u0000\u0000\u0000\u0439"+
		"\u00d1\u0001\u0000\u0000\u0000\u043a\u0442\u0003\u0132\u0099\u0000\u043b"+
		"\u0442\u0005\t\u0000\u0000\u043c\u043f\u0005\f\u0000\u0000\u043d\u0440"+
		"\u0003\u0132\u0099\u0000\u043e\u0440\u0005\t\u0000\u0000\u043f\u043d\u0001"+
		"\u0000\u0000\u0000\u043f\u043e\u0001\u0000\u0000\u0000\u0440\u0442\u0001"+
		"\u0000\u0000\u0000\u0441\u043a\u0001\u0000\u0000\u0000\u0441\u043b\u0001"+
		"\u0000\u0000\u0000\u0441\u043c\u0001\u0000\u0000\u0000\u0442\u00d3\u0001"+
		"\u0000\u0000\u0000\u0443\u0444\u0005\u0096\u0000\u0000\u0444\u00d5\u0001"+
		"\u0000\u0000\u0000\u0445\u0448\u0003\u00deo\u0000\u0446\u0448\u0003\u00d8"+
		"l\u0000\u0447\u0445\u0001\u0000\u0000\u0000\u0447\u0446\u0001\u0000\u0000"+
		"\u0000\u0448\u00d7\u0001\u0000\u0000\u0000\u0449\u044a\u0005\u0010\u0000"+
		"\u0000\u044a\u044b\u0003\u00a2Q\u0000\u044b\u044c\u0005\u0011\u0000\u0000"+
		"\u044c\u00d9\u0001\u0000\u0000\u0000\u044d\u0450\u0003\u00e0p\u0000\u044e"+
		"\u0450\u0003\u00dcn\u0000\u044f\u044d\u0001\u0000\u0000\u0000\u044f\u044e"+
		"\u0001\u0000\u0000\u0000\u0450\u00db\u0001\u0000\u0000\u0000\u0451\u0452"+
		"\u0005\u0010\u0000\u0000\u0452\u0453\u0003\u00aeW\u0000\u0453\u0454\u0005"+
		"\u0011\u0000\u0000\u0454\u00dd\u0001\u0000\u0000\u0000\u0455\u0457\u0005"+
		"\u0002\u0000\u0000\u0456\u0458\u0003\u00e2q\u0000\u0457\u0456\u0001\u0000"+
		"\u0000\u0000\u0458\u0459\u0001\u0000\u0000\u0000\u0459\u0457\u0001\u0000"+
		"\u0000\u0000\u0459\u045a\u0001\u0000\u0000\u0000\u045a\u045b\u0001\u0000"+
		"\u0000\u0000\u045b\u045c\u0005\u0003\u0000\u0000\u045c\u00df\u0001\u0000"+
		"\u0000\u0000\u045d\u045f\u0005\u0002\u0000\u0000\u045e\u0460\u0003\u00e4"+
		"r\u0000\u045f\u045e\u0001\u0000\u0000\u0000\u0460\u0461\u0001\u0000\u0000"+
		"\u0000\u0461\u045f\u0001\u0000\u0000\u0000\u0461\u0462\u0001\u0000\u0000"+
		"\u0000\u0462\u0463\u0001\u0000\u0000\u0000\u0463\u0464\u0005\u0003\u0000"+
		"\u0000\u0464\u00e1\u0001\u0000\u0000\u0000\u0465\u0468\u0003\u00e6s\u0000"+
		"\u0466\u0468\u0003\u00d6k\u0000\u0467\u0465\u0001\u0000\u0000\u0000\u0467"+
		"\u0466\u0001\u0000\u0000\u0000\u0468\u00e3\u0001\u0000\u0000\u0000\u0469"+
		"\u046c\u0003\u00e6s\u0000\u046a\u046c\u0003\u00dam\u0000\u046b\u0469\u0001"+
		"\u0000\u0000\u0000\u046b\u046a\u0001\u0000\u0000\u0000\u046c\u00e5\u0001"+
		"\u0000\u0000\u0000\u046d\u0470\u0003\u00eau\u0000\u046e\u0470\u0003\u00ec"+
		"v\u0000\u046f\u046d\u0001\u0000\u0000\u0000\u046f\u046e\u0001\u0000\u0000"+
		"\u0000\u0470\u00e7\u0001\u0000\u0000\u0000\u0471\u0474\u0003\u00eau\u0000"+
		"\u0472\u0474\u0003\u0132\u0099\u0000\u0473\u0471\u0001\u0000\u0000\u0000"+
		"\u0473\u0472\u0001\u0000\u0000\u0000\u0474\u00e9\u0001\u0000\u0000\u0000"+
		"\u0475\u0476\u0007\u0002\u0000\u0000\u0476\u00eb\u0001\u0000\u0000\u0000"+
		"\u0477\u047e\u0003\u0132\u0099\u0000\u0478\u047e\u0003\u0124\u0092\u0000"+
		"\u0479\u047e\u0003\u0126\u0093\u0000\u047a\u047e\u0003\u012e\u0097\u0000"+
		"\u047b\u047e\u0003\u0136\u009b\u0000\u047c\u047e\u0005\u00a5\u0000\u0000"+
		"\u047d\u0477\u0001\u0000\u0000\u0000\u047d\u0478\u0001\u0000\u0000\u0000"+
		"\u047d\u0479\u0001\u0000\u0000\u0000\u047d\u047a\u0001\u0000\u0000\u0000"+
		"\u047d\u047b\u0001\u0000\u0000\u0000\u047d\u047c\u0001\u0000\u0000\u0000"+
		"\u047e\u00ed\u0001\u0000\u0000\u0000\u047f\u0480\u0003\u00f0x\u0000\u0480"+
		"\u00ef\u0001\u0000\u0000\u0000\u0481\u0486\u0003\u00f2y\u0000\u0482\u0483"+
		"\u0005\u0012\u0000\u0000\u0483\u0485\u0003\u00f2y\u0000\u0484\u0482\u0001"+
		"\u0000\u0000\u0000\u0485\u0488\u0001\u0000\u0000\u0000\u0486\u0484\u0001"+
		"\u0000\u0000\u0000\u0486\u0487\u0001\u0000\u0000\u0000\u0487\u00f1\u0001"+
		"\u0000\u0000\u0000\u0488\u0486\u0001\u0000\u0000\u0000\u0489\u048e\u0003"+
		"\u00f4z\u0000\u048a\u048b\u0005\u0013\u0000\u0000\u048b\u048d\u0003\u00f4"+
		"z\u0000\u048c\u048a\u0001\u0000\u0000\u0000\u048d\u0490\u0001\u0000\u0000"+
		"\u0000\u048e\u048c\u0001\u0000\u0000\u0000\u048e\u048f\u0001\u0000\u0000"+
		"\u0000\u048f\u00f3\u0001\u0000\u0000\u0000\u0490\u048e\u0001\u0000\u0000"+
		"\u0000\u0491\u0492\u0003\u00f6{\u0000\u0492\u00f5\u0001\u0000\u0000\u0000"+
		"\u0493\u04a5\u0003\u00f8|\u0000\u0494\u0495\u0005\u0014\u0000\u0000\u0495"+
		"\u04a6\u0003\u00f8|\u0000\u0496\u0497\u0005\u0015\u0000\u0000\u0497\u04a6"+
		"\u0003\u00f8|\u0000\u0498\u0499\u0005\u0016\u0000\u0000\u0499\u04a6\u0003"+
		"\u00f8|\u0000\u049a\u049b\u0005\u0017\u0000\u0000\u049b\u04a6\u0003\u00f8"+
		"|\u0000\u049c\u049d\u0005\u0018\u0000\u0000\u049d\u04a6\u0003\u00f8|\u0000"+
		"\u049e\u049f\u0005\u0019\u0000\u0000\u049f\u04a6\u0003\u00f8|\u0000\u04a0"+
		"\u04a1\u0005O\u0000\u0000\u04a1\u04a6\u0003\u0098L\u0000\u04a2\u04a3\u0005"+
		"N\u0000\u0000\u04a3\u04a4\u0005O\u0000\u0000\u04a4\u04a6\u0003\u0098L"+
		"\u0000\u04a5\u0494\u0001\u0000\u0000\u0000\u04a5\u0496\u0001\u0000\u0000"+
		"\u0000\u04a5\u0498\u0001\u0000\u0000\u0000\u04a5\u049a\u0001\u0000\u0000"+
		"\u0000\u04a5\u049c\u0001\u0000\u0000\u0000\u04a5\u049e\u0001\u0000\u0000"+
		"\u0000\u04a5\u04a0\u0001\u0000\u0000\u0000\u04a5\u04a2\u0001\u0000\u0000"+
		"\u0000\u04a5\u04a6\u0001\u0000\u0000\u0000\u04a6\u00f7\u0001\u0000\u0000"+
		"\u0000\u04a7\u04a8\u0003\u00fa}\u0000\u04a8\u00f9\u0001\u0000\u0000\u0000"+
		"\u04a9\u04ad\u0003\u0104\u0082\u0000\u04aa\u04ac\u0003\u00fc~\u0000\u04ab"+
		"\u04aa\u0001\u0000\u0000\u0000\u04ac\u04af\u0001\u0000\u0000\u0000\u04ad"+
		"\u04ab\u0001\u0000\u0000\u0000\u04ad\u04ae\u0001\u0000\u0000\u0000\u04ae"+
		"\u00fb\u0001\u0000\u0000\u0000\u04af\u04ad\u0001\u0000\u0000\u0000\u04b0"+
		"\u04b1\u0005\r\u0000\u0000\u04b1\u04b6\u0003\u00fe\u007f\u0000\u04b2\u04b3"+
		"\u0005\u001a\u0000\u0000\u04b3\u04b6\u0003\u0100\u0080\u0000\u04b4\u04b6"+
		"\u0003\u0102\u0081\u0000\u04b5\u04b0\u0001\u0000\u0000\u0000\u04b5\u04b2"+
		"\u0001\u0000\u0000\u0000\u04b5\u04b4\u0001\u0000\u0000\u0000\u04b6\u00fd"+
		"\u0001\u0000\u0000\u0000\u04b7\u04b8\u0003\u0104\u0082\u0000\u04b8\u00ff"+
		"\u0001\u0000\u0000\u0000\u04b9\u04ba\u0003\u0104\u0082\u0000\u04ba\u0101"+
		"\u0001\u0000\u0000\u0000\u04bb\u04be\u0003\u012a\u0095\u0000\u04bc\u04be"+
		"\u0003\u012c\u0096\u0000\u04bd\u04bb\u0001\u0000\u0000\u0000\u04bd\u04bc"+
		"\u0001\u0000\u0000\u0000\u04be\u04c2\u0001\u0000\u0000\u0000\u04bf\u04c1"+
		"\u0003\u0106\u0083\u0000\u04c0\u04bf\u0001\u0000\u0000\u0000\u04c1\u04c4"+
		"\u0001\u0000\u0000\u0000\u04c2\u04c0\u0001\u0000\u0000\u0000\u04c2\u04c3"+
		"\u0001\u0000\u0000\u0000\u04c3\u0103\u0001\u0000\u0000\u0000\u04c4\u04c2"+
		"\u0001\u0000\u0000\u0000\u04c5\u04c9\u0003\u010c\u0086\u0000\u04c6\u04c8"+
		"\u0003\u0106\u0083\u0000\u04c7\u04c6\u0001\u0000\u0000\u0000\u04c8\u04cb"+
		"\u0001\u0000\u0000\u0000\u04c9\u04c7\u0001\u0000\u0000\u0000\u04c9\u04ca"+
		"\u0001\u0000\u0000\u0000\u04ca\u0105\u0001\u0000\u0000\u0000\u04cb\u04c9"+
		"\u0001\u0000\u0000\u0000\u04cc\u04cf\u0003\u0108\u0084\u0000\u04cd\u04cf"+
		"\u0003\u010a\u0085\u0000\u04ce\u04cc\u0001\u0000\u0000\u0000\u04ce\u04cd"+
		"\u0001\u0000\u0000\u0000\u04cf\u0107\u0001\u0000\u0000\u0000\u04d0\u04d1"+
		"\u0005\u0001\u0000\u0000\u04d1\u04d2\u0003\u010c\u0086\u0000\u04d2\u0109"+
		"\u0001\u0000\u0000\u0000\u04d3\u04d4\u0005\u000b\u0000\u0000\u04d4\u04d5"+
		"\u0003\u010c\u0086\u0000\u04d5\u010b\u0001\u0000\u0000\u0000\u04d6\u04d7"+
		"\u0005\u000f\u0000\u0000\u04d7\u04de\u0003\u010e\u0087\u0000\u04d8\u04d9"+
		"\u0005\r\u0000\u0000\u04d9\u04de\u0003\u010e\u0087\u0000\u04da\u04db\u0005"+
		"\u001a\u0000\u0000\u04db\u04de\u0003\u010e\u0087\u0000\u04dc\u04de\u0003"+
		"\u010e\u0087\u0000\u04dd\u04d6\u0001\u0000\u0000\u0000\u04dd\u04d8\u0001"+
		"\u0000\u0000\u0000\u04dd\u04da\u0001\u0000\u0000\u0000\u04dd\u04dc\u0001"+
		"\u0000\u0000\u0000\u04de\u010d\u0001\u0000\u0000\u0000\u04df\u04e7\u0003"+
		"\u0110\u0088\u0000\u04e0\u04e7\u0003\u0112\u0089\u0000\u04e1\u04e7\u0003"+
		"\u0122\u0091\u0000\u04e2\u04e7\u0003\u0124\u0092\u0000\u04e3\u04e7\u0003"+
		"\u0126\u0093\u0000\u04e4\u04e7\u0003\u012e\u0097\u0000\u04e5\u04e7\u0003"+
		"\u00eau\u0000\u04e6\u04df\u0001\u0000\u0000\u0000\u04e6\u04e0\u0001\u0000"+
		"\u0000\u0000\u04e6\u04e1\u0001\u0000\u0000\u0000\u04e6\u04e2\u0001\u0000"+
		"\u0000\u0000\u04e6\u04e3\u0001\u0000\u0000\u0000\u04e6\u04e4\u0001\u0000"+
		"\u0000\u0000\u04e6\u04e5\u0001\u0000\u0000\u0000\u04e7\u010f\u0001\u0000"+
		"\u0000\u0000\u04e8\u04e9\u0005\u0002\u0000\u0000\u04e9\u04ea\u0003\u00ee"+
		"w\u0000\u04ea\u04eb\u0005\u0003\u0000\u0000\u04eb\u0111\u0001\u0000\u0000"+
		"\u0000\u04ec\u05eb\u0003\u0120\u0090\u0000\u04ed\u04ee\u0005P\u0000\u0000"+
		"\u04ee\u04ef\u0005\u0002\u0000\u0000\u04ef\u04f0\u0003\u00eew\u0000\u04f0"+
		"\u04f1\u0005\u0003\u0000\u0000\u04f1\u05eb\u0001\u0000\u0000\u0000\u04f2"+
		"\u05eb\u0003\u0116\u008b\u0000\u04f3\u04f4\u0005R\u0000\u0000\u04f4\u04f5"+
		"\u0005\u0002\u0000\u0000\u04f5\u04f6\u0003\u00eew\u0000\u04f6\u04f7\u0005"+
		"\b\u0000\u0000\u04f7\u04f8\u0003\u00eew\u0000\u04f8\u04f9\u0005\u0003"+
		"\u0000\u0000\u04f9\u05eb\u0001\u0000\u0000\u0000\u04fa\u04fb\u0005S\u0000"+
		"\u0000\u04fb\u04fc\u0005\u0002\u0000\u0000\u04fc\u04fd\u0003\u00eew\u0000"+
		"\u04fd\u04fe\u0005\u0003\u0000\u0000\u04fe\u05eb\u0001\u0000\u0000\u0000"+
		"\u04ff\u0500\u0005T\u0000\u0000\u0500\u0501\u0005\u0002\u0000\u0000\u0501"+
		"\u0502\u0003\u00eau\u0000\u0502\u0503\u0005\u0003\u0000\u0000\u0503\u05eb"+
		"\u0001\u0000\u0000\u0000\u0504\u0505\u0005U\u0000\u0000\u0505\u0506\u0005"+
		"\u0002\u0000\u0000\u0506\u0507\u0003\u00eew\u0000\u0507\u0508\u0005\u0003"+
		"\u0000\u0000\u0508\u05eb\u0001\u0000\u0000\u0000\u0509\u050a\u0005V\u0000"+
		"\u0000\u050a\u050b\u0005\u0002\u0000\u0000\u050b\u050c\u0003\u00eew\u0000"+
		"\u050c\u050d\u0005\u0003\u0000\u0000\u050d\u05eb\u0001\u0000\u0000\u0000"+
		"\u050e\u0514\u0005W\u0000\u0000\u050f\u0510\u0005\u0002\u0000\u0000\u0510"+
		"\u0511\u0003\u00eew\u0000\u0511\u0512\u0005\u0003\u0000\u0000\u0512\u0515"+
		"\u0001\u0000\u0000\u0000\u0513\u0515\u0005\u00a5\u0000\u0000\u0514\u050f"+
		"\u0001\u0000\u0000\u0000\u0514\u0513\u0001\u0000\u0000\u0000\u0515\u05eb"+
		"\u0001\u0000\u0000\u0000\u0516\u0517\u0005X\u0000\u0000\u0517\u05eb\u0005"+
		"\u00a5\u0000\u0000\u0518\u0519\u0005Y\u0000\u0000\u0519\u051a\u0005\u0002"+
		"\u0000\u0000\u051a\u051b\u0003\u00eew\u0000\u051b\u051c\u0005\u0003\u0000"+
		"\u0000\u051c\u05eb\u0001\u0000\u0000\u0000\u051d\u051e\u0005Z\u0000\u0000"+
		"\u051e\u051f\u0005\u0002\u0000\u0000\u051f\u0520\u0003\u00eew\u0000\u0520"+
		"\u0521\u0005\u0003\u0000\u0000\u0521\u05eb\u0001\u0000\u0000\u0000\u0522"+
		"\u0523\u0005[\u0000\u0000\u0523\u0524\u0005\u0002\u0000\u0000\u0524\u0525"+
		"\u0003\u00eew\u0000\u0525\u0526\u0005\u0003\u0000\u0000\u0526\u05eb\u0001"+
		"\u0000\u0000\u0000\u0527\u0528\u0005\\\u0000\u0000\u0528\u0529\u0005\u0002"+
		"\u0000\u0000\u0529\u052a\u0003\u00eew\u0000\u052a\u052b\u0005\u0003\u0000"+
		"\u0000\u052b\u05eb\u0001\u0000\u0000\u0000\u052c\u052d\u0005]\u0000\u0000"+
		"\u052d\u05eb\u0003\u0098L\u0000\u052e\u05eb\u0003\u0118\u008c\u0000\u052f"+
		"\u0530\u0005^\u0000\u0000\u0530\u0531\u0005\u0002\u0000\u0000\u0531\u0532"+
		"\u0003\u00eew\u0000\u0532\u0533\u0005\u0003\u0000\u0000\u0533\u05eb\u0001"+
		"\u0000\u0000\u0000\u0534\u05eb\u0003\u011a\u008d\u0000\u0535\u0536\u0005"+
		"_\u0000\u0000\u0536\u0537\u0005\u0002\u0000\u0000\u0537\u0538\u0003\u00ee"+
		"w\u0000\u0538\u0539\u0005\u0003\u0000\u0000\u0539\u05eb\u0001\u0000\u0000"+
		"\u0000\u053a\u053b\u0005`\u0000\u0000\u053b\u053c\u0005\u0002\u0000\u0000"+
		"\u053c\u053d\u0003\u00eew\u0000\u053d\u053e\u0005\u0003\u0000\u0000\u053e"+
		"\u05eb\u0001\u0000\u0000\u0000\u053f\u0540\u0005a\u0000\u0000\u0540\u0541"+
		"\u0005\u0002\u0000\u0000\u0541\u0542\u0003\u00eew\u0000\u0542\u0543\u0005"+
		"\u0003\u0000\u0000\u0543\u05eb\u0001\u0000\u0000\u0000\u0544\u0545\u0005"+
		"c\u0000\u0000\u0545\u0546\u0005\u0002\u0000\u0000\u0546\u0547\u0003\u00ee"+
		"w\u0000\u0547\u0548\u0005\b\u0000\u0000\u0548\u0549\u0003\u00eew\u0000"+
		"\u0549\u054a\u0005\u0003\u0000\u0000\u054a\u05eb\u0001\u0000\u0000\u0000"+
		"\u054b\u054c\u0005d\u0000\u0000\u054c\u054d\u0005\u0002\u0000\u0000\u054d"+
		"\u054e\u0003\u00eew\u0000\u054e\u054f\u0005\b\u0000\u0000\u054f\u0550"+
		"\u0003\u00eew\u0000\u0550\u0551\u0005\u0003\u0000\u0000\u0551\u05eb\u0001"+
		"\u0000\u0000\u0000\u0552\u0553\u0005e\u0000\u0000\u0553\u0554\u0005\u0002"+
		"\u0000\u0000\u0554\u0555\u0003\u00eew\u0000\u0555\u0556\u0005\b\u0000"+
		"\u0000\u0556\u0557\u0003\u00eew\u0000\u0557\u0558\u0005\u0003\u0000\u0000"+
		"\u0558\u05eb\u0001\u0000\u0000\u0000\u0559\u055a\u0005f\u0000\u0000\u055a"+
		"\u055b\u0005\u0002\u0000\u0000\u055b\u055c\u0003\u00eew\u0000\u055c\u055d"+
		"\u0005\b\u0000\u0000\u055d\u055e\u0003\u00eew\u0000\u055e\u055f\u0005"+
		"\u0003\u0000\u0000\u055f\u05eb\u0001\u0000\u0000\u0000\u0560\u0561\u0005"+
		"g\u0000\u0000\u0561\u0562\u0005\u0002\u0000\u0000\u0562\u0563\u0003\u00ee"+
		"w\u0000\u0563\u0564\u0005\b\u0000\u0000\u0564\u0565\u0003\u00eew\u0000"+
		"\u0565\u0566\u0005\u0003\u0000\u0000\u0566\u05eb\u0001\u0000\u0000\u0000"+
		"\u0567\u0568\u0005h\u0000\u0000\u0568\u0569\u0005\u0002\u0000\u0000\u0569"+
		"\u056a\u0003\u00eew\u0000\u056a\u056b\u0005\u0003\u0000\u0000\u056b\u05eb"+
		"\u0001\u0000\u0000\u0000\u056c\u056d\u0005i\u0000\u0000\u056d\u056e\u0005"+
		"\u0002\u0000\u0000\u056e\u056f\u0003\u00eew\u0000\u056f\u0570\u0005\u0003"+
		"\u0000\u0000\u0570\u05eb\u0001\u0000\u0000\u0000\u0571\u0572\u0005j\u0000"+
		"\u0000\u0572\u0573\u0005\u0002\u0000\u0000\u0573\u0574\u0003\u00eew\u0000"+
		"\u0574\u0575\u0005\u0003\u0000\u0000\u0575\u05eb\u0001\u0000\u0000\u0000"+
		"\u0576\u0577\u0005k\u0000\u0000\u0577\u0578\u0005\u0002\u0000\u0000\u0578"+
		"\u0579\u0003\u00eew\u0000\u0579\u057a\u0005\u0003\u0000\u0000\u057a\u05eb"+
		"\u0001\u0000\u0000\u0000\u057b\u057c\u0005l\u0000\u0000\u057c\u057d\u0005"+
		"\u0002\u0000\u0000\u057d\u057e\u0003\u00eew\u0000\u057e\u057f\u0005\u0003"+
		"\u0000\u0000\u057f\u05eb\u0001\u0000\u0000\u0000\u0580\u0581\u0005m\u0000"+
		"\u0000\u0581\u0582\u0005\u0002\u0000\u0000\u0582\u0583\u0003\u00eew\u0000"+
		"\u0583\u0584\u0005\u0003\u0000\u0000\u0584\u05eb\u0001\u0000\u0000\u0000"+
		"\u0585\u0586\u0005n\u0000\u0000\u0586\u0587\u0005\u0002\u0000\u0000\u0587"+
		"\u0588\u0003\u00eew\u0000\u0588\u0589\u0005\u0003\u0000\u0000\u0589\u05eb"+
		"\u0001\u0000\u0000\u0000\u058a\u058b\u0005o\u0000\u0000\u058b\u058c\u0005"+
		"\u0002\u0000\u0000\u058c\u058d\u0003\u00eew\u0000\u058d\u058e\u0005\u0003"+
		"\u0000\u0000\u058e\u05eb\u0001\u0000\u0000\u0000\u058f\u0590\u0005p\u0000"+
		"\u0000\u0590\u05eb\u0005\u00a5\u0000\u0000\u0591\u0592\u0005q\u0000\u0000"+
		"\u0592\u05eb\u0005\u00a5\u0000\u0000\u0593\u0594\u0005r\u0000\u0000\u0594"+
		"\u05eb\u0005\u00a5\u0000\u0000\u0595\u0596\u0005w\u0000\u0000\u0596\u0597"+
		"\u0005\u0002\u0000\u0000\u0597\u0598\u0003\u00eew\u0000\u0598\u0599\u0005"+
		"\u0003\u0000\u0000\u0599\u05eb\u0001\u0000\u0000\u0000\u059a\u059b\u0005"+
		"s\u0000\u0000\u059b\u059c\u0005\u0002\u0000\u0000\u059c\u059d\u0003\u00ee"+
		"w\u0000\u059d\u059e\u0005\u0003\u0000\u0000\u059e\u05eb\u0001\u0000\u0000"+
		"\u0000\u059f\u05a0\u0005t\u0000\u0000\u05a0\u05a1\u0005\u0002\u0000\u0000"+
		"\u05a1\u05a2\u0003\u00eew\u0000\u05a2\u05a3\u0005\u0003\u0000\u0000\u05a3"+
		"\u05eb\u0001\u0000\u0000\u0000\u05a4\u05a5\u0005u\u0000\u0000\u05a5\u05a6"+
		"\u0005\u0002\u0000\u0000\u05a6\u05a7\u0003\u00eew\u0000\u05a7\u05a8\u0005"+
		"\u0003\u0000\u0000\u05a8\u05eb\u0001\u0000\u0000\u0000\u05a9\u05aa\u0005"+
		"v\u0000\u0000\u05aa\u05ab\u0005\u0002\u0000\u0000\u05ab\u05ac\u0003\u00ee"+
		"w\u0000\u05ac\u05ad\u0005\u0003\u0000\u0000\u05ad\u05eb\u0001\u0000\u0000"+
		"\u0000\u05ae\u05af\u0005x\u0000\u0000\u05af\u05eb\u0003\u0098L\u0000\u05b0"+
		"\u05b1\u0005y\u0000\u0000\u05b1\u05b2\u0005\u0002\u0000\u0000\u05b2\u05b3"+
		"\u0003\u00eew\u0000\u05b3\u05b4\u0005\b\u0000\u0000\u05b4\u05b5\u0003"+
		"\u00eew\u0000\u05b5\u05b6\u0005\b\u0000\u0000\u05b6\u05b7\u0003\u00ee"+
		"w\u0000\u05b7\u05b8\u0005\u0003\u0000\u0000\u05b8\u05eb\u0001\u0000\u0000"+
		"\u0000\u05b9\u05ba\u0005z\u0000\u0000\u05ba\u05bb\u0005\u0002\u0000\u0000"+
		"\u05bb\u05bc\u0003\u00eew\u0000\u05bc\u05bd\u0005\b\u0000\u0000\u05bd"+
		"\u05be\u0003\u00eew\u0000\u05be\u05bf\u0005\u0003\u0000\u0000\u05bf\u05eb"+
		"\u0001\u0000\u0000\u0000\u05c0\u05c1\u0005{\u0000\u0000\u05c1\u05c2\u0005"+
		"\u0002\u0000\u0000\u05c2\u05c3\u0003\u00eew\u0000\u05c3\u05c4\u0005\b"+
		"\u0000\u0000\u05c4\u05c5\u0003\u00eew\u0000\u05c5\u05c6\u0005\u0003\u0000"+
		"\u0000\u05c6\u05eb\u0001\u0000\u0000\u0000\u05c7\u05c8\u0005|\u0000\u0000"+
		"\u05c8\u05c9\u0005\u0002\u0000\u0000\u05c9\u05ca\u0003\u00eew\u0000\u05ca"+
		"\u05cb\u0005\b\u0000\u0000\u05cb\u05cc\u0003\u00eew\u0000\u05cc\u05cd"+
		"\u0005\u0003\u0000\u0000\u05cd\u05eb\u0001\u0000\u0000\u0000\u05ce\u05cf"+
		"\u0005}\u0000\u0000\u05cf\u05d0\u0005\u0002\u0000\u0000\u05d0\u05d1\u0003"+
		"\u00eew\u0000\u05d1\u05d2\u0005\u0003\u0000\u0000\u05d2\u05eb\u0001\u0000"+
		"\u0000\u0000\u05d3\u05d4\u0005~\u0000\u0000\u05d4\u05d5\u0005\u0002\u0000"+
		"\u0000\u05d5\u05d6\u0003\u00eew\u0000\u05d6\u05d7\u0005\u0003\u0000\u0000"+
		"\u05d7\u05eb\u0001\u0000\u0000\u0000\u05d8\u05d9\u0005\u007f\u0000\u0000"+
		"\u05d9\u05da\u0005\u0002\u0000\u0000\u05da\u05db\u0003\u00eew\u0000\u05db"+
		"\u05dc\u0005\u0003\u0000\u0000\u05dc\u05eb\u0001\u0000\u0000\u0000\u05dd"+
		"\u05de\u0005\u0080\u0000\u0000\u05de\u05df\u0005\u0002\u0000\u0000\u05df"+
		"\u05e0\u0003\u00eew\u0000\u05e0\u05e1\u0005\u0003\u0000\u0000\u05e1\u05eb"+
		"\u0001\u0000\u0000\u0000\u05e2\u05e3\u0005\u0081\u0000\u0000\u05e3\u05e4"+
		"\u0005\u0002\u0000\u0000\u05e4\u05e5\u0003\u00eew\u0000\u05e5\u05e6\u0005"+
		"\u0003\u0000\u0000\u05e6\u05eb\u0001\u0000\u0000\u0000\u05e7\u05eb\u0003"+
		"\u0114\u008a\u0000\u05e8\u05eb\u0003\u011c\u008e\u0000\u05e9\u05eb\u0003"+
		"\u011e\u008f\u0000\u05ea\u04ec\u0001\u0000\u0000\u0000\u05ea\u04ed\u0001"+
		"\u0000\u0000\u0000\u05ea\u04f2\u0001\u0000\u0000\u0000\u05ea\u04f3\u0001"+
		"\u0000\u0000\u0000\u05ea\u04fa\u0001\u0000\u0000\u0000\u05ea\u04ff\u0001"+
		"\u0000\u0000\u0000\u05ea\u0504\u0001\u0000\u0000\u0000\u05ea\u0509\u0001"+
		"\u0000\u0000\u0000\u05ea\u050e\u0001\u0000\u0000\u0000\u05ea\u0516\u0001"+
		"\u0000\u0000\u0000\u05ea\u0518\u0001\u0000\u0000\u0000\u05ea\u051d\u0001"+
		"\u0000\u0000\u0000\u05ea\u0522\u0001\u0000\u0000\u0000\u05ea\u0527\u0001"+
		"\u0000\u0000\u0000\u05ea\u052c\u0001\u0000\u0000\u0000\u05ea\u052e\u0001"+
		"\u0000\u0000\u0000\u05ea\u052f\u0001\u0000\u0000\u0000\u05ea\u0534\u0001"+
		"\u0000\u0000\u0000\u05ea\u0535\u0001\u0000\u0000\u0000\u05ea\u053a\u0001"+
		"\u0000\u0000\u0000\u05ea\u053f\u0001\u0000\u0000\u0000\u05ea\u0544\u0001"+
		"\u0000\u0000\u0000\u05ea\u054b\u0001\u0000\u0000\u0000\u05ea\u0552\u0001"+
		"\u0000\u0000\u0000\u05ea\u0559\u0001\u0000\u0000\u0000\u05ea\u0560\u0001"+
		"\u0000\u0000\u0000\u05ea\u0567\u0001\u0000\u0000\u0000\u05ea\u056c\u0001"+
		"\u0000\u0000\u0000\u05ea\u0571\u0001\u0000\u0000\u0000\u05ea\u0576\u0001"+
		"\u0000\u0000\u0000\u05ea\u057b\u0001\u0000\u0000\u0000\u05ea\u0580\u0001"+
		"\u0000\u0000\u0000\u05ea\u0585\u0001\u0000\u0000\u0000\u05ea\u058a\u0001"+
		"\u0000\u0000\u0000\u05ea\u058f\u0001\u0000\u0000\u0000\u05ea\u0591\u0001"+
		"\u0000\u0000\u0000\u05ea\u0593\u0001\u0000\u0000\u0000\u05ea\u0595\u0001"+
		"\u0000\u0000\u0000\u05ea\u059a\u0001\u0000\u0000\u0000\u05ea\u059f\u0001"+
		"\u0000\u0000\u0000\u05ea\u05a4\u0001\u0000\u0000\u0000\u05ea\u05a9\u0001"+
		"\u0000\u0000\u0000\u05ea\u05ae\u0001\u0000\u0000\u0000\u05ea\u05b0\u0001"+
		"\u0000\u0000\u0000\u05ea\u05b9\u0001\u0000\u0000\u0000\u05ea\u05c0\u0001"+
		"\u0000\u0000\u0000\u05ea\u05c7\u0001\u0000\u0000\u0000\u05ea\u05ce\u0001"+
		"\u0000\u0000\u0000\u05ea\u05d3\u0001\u0000\u0000\u0000\u05ea\u05d8\u0001"+
		"\u0000\u0000\u0000\u05ea\u05dd\u0001\u0000\u0000\u0000\u05ea\u05e2\u0001"+
		"\u0000\u0000\u0000\u05ea\u05e7\u0001\u0000\u0000\u0000\u05ea\u05e8\u0001"+
		"\u0000\u0000\u0000\u05ea\u05e9\u0001\u0000\u0000\u0000\u05eb\u0113\u0001"+
		"\u0000\u0000\u0000\u05ec\u05ed\u0005\u0082\u0000\u0000\u05ed\u05ee\u0005"+
		"\u0002\u0000\u0000\u05ee\u05ef\u0003\u00eew\u0000\u05ef\u05f0\u0005\b"+
		"\u0000\u0000\u05f0\u05f3\u0003\u00eew\u0000\u05f1\u05f2\u0005\b\u0000"+
		"\u0000\u05f2\u05f4\u0003\u00eew\u0000\u05f3\u05f1\u0001\u0000\u0000\u0000"+
		"\u05f3\u05f4\u0001\u0000\u0000\u0000\u05f4\u05f5\u0001\u0000\u0000\u0000"+
		"\u05f5\u05f6\u0005\u0003\u0000\u0000\u05f6\u0115\u0001\u0000\u0000\u0000"+
		"\u05f7\u05f8\u0005Q\u0000\u0000\u05f8\u05f9\u0005\u0002\u0000\u0000\u05f9"+
		"\u05fa\u0003\u00eew\u0000\u05fa\u05fb\u0005\u0003\u0000\u0000\u05fb\u0117"+
		"\u0001\u0000\u0000\u0000\u05fc\u05fd\u0005\u0083\u0000\u0000\u05fd\u05fe"+
		"\u0005\u0002\u0000\u0000\u05fe\u05ff\u0003\u00eew\u0000\u05ff\u0600\u0005"+
		"\b\u0000\u0000\u0600\u0603\u0003\u00eew\u0000\u0601\u0602\u0005\b\u0000"+
		"\u0000\u0602\u0604\u0003\u00eew\u0000\u0603\u0601\u0001\u0000\u0000\u0000"+
		"\u0603\u0604\u0001\u0000\u0000\u0000\u0604\u0605\u0001\u0000\u0000\u0000"+
		"\u0605\u0606\u0005\u0003\u0000\u0000\u0606\u0119\u0001\u0000\u0000\u0000"+
		"\u0607\u0608\u0005\u0084\u0000\u0000\u0608\u0609\u0005\u0002\u0000\u0000"+
		"\u0609\u060a\u0003\u00eew\u0000\u060a\u060b\u0005\b\u0000\u0000\u060b"+
		"\u060c\u0003\u00eew\u0000\u060c\u060d\u0005\b\u0000\u0000\u060d\u0610"+
		"\u0003\u00eew\u0000\u060e\u060f\u0005\b\u0000\u0000\u060f\u0611\u0003"+
		"\u00eew\u0000\u0610\u060e\u0001\u0000\u0000\u0000\u0610\u0611\u0001\u0000"+
		"\u0000\u0000\u0611\u0612\u0001\u0000\u0000\u0000\u0612\u0613\u0005\u0003"+
		"\u0000\u0000\u0613\u011b\u0001\u0000\u0000\u0000\u0614\u0615\u0005\u0085"+
		"\u0000\u0000\u0615\u0616\u0003n7\u0000\u0616\u011d\u0001\u0000\u0000\u0000"+
		"\u0617\u0618\u0005N\u0000\u0000\u0618\u0619\u0005\u0085\u0000\u0000\u0619"+
		"\u061a\u0003n7\u0000\u061a\u011f\u0001\u0000\u0000\u0000\u061b\u061c\u0005"+
		"\u0086\u0000\u0000\u061c\u061e\u0005\u0002\u0000\u0000\u061d\u061f\u0005"+
		"!\u0000\u0000\u061e\u061d\u0001\u0000\u0000\u0000\u061e\u061f\u0001\u0000"+
		"\u0000\u0000\u061f\u0622\u0001\u0000\u0000\u0000\u0620\u0623\u0005\u0001"+
		"\u0000\u0000\u0621\u0623\u0003\u00eew\u0000\u0622\u0620\u0001\u0000\u0000"+
		"\u0000\u0622\u0621\u0001\u0000\u0000\u0000\u0623\u0624\u0001\u0000\u0000"+
		"\u0000\u0624\u0664\u0005\u0003\u0000\u0000\u0625\u0626\u0005\u0087\u0000"+
		"\u0000\u0626\u0628\u0005\u0002\u0000\u0000\u0627\u0629\u0005!\u0000\u0000"+
		"\u0628\u0627\u0001\u0000\u0000\u0000\u0628\u0629\u0001\u0000\u0000\u0000"+
		"\u0629\u062a\u0001\u0000\u0000\u0000\u062a\u062b\u0003\u00eew\u0000\u062b"+
		"\u062c\u0005\u0003\u0000\u0000\u062c\u0664\u0001\u0000\u0000\u0000\u062d"+
		"\u062e\u0005\u0088\u0000\u0000\u062e\u0630\u0005\u0002\u0000\u0000\u062f"+
		"\u0631\u0005!\u0000\u0000\u0630\u062f\u0001\u0000\u0000\u0000\u0630\u0631"+
		"\u0001\u0000\u0000\u0000\u0631\u0632\u0001\u0000\u0000\u0000\u0632\u0633"+
		"\u0003\u00eew\u0000\u0633\u0634\u0005\u0003\u0000\u0000\u0634\u0664\u0001"+
		"\u0000\u0000\u0000\u0635\u0636\u0005\u0089\u0000\u0000\u0636\u0638\u0005"+
		"\u0002\u0000\u0000\u0637\u0639\u0005!\u0000\u0000\u0638\u0637\u0001\u0000"+
		"\u0000\u0000\u0638\u0639\u0001\u0000\u0000\u0000\u0639\u063a\u0001\u0000"+
		"\u0000\u0000\u063a\u063b\u0003\u00eew\u0000\u063b\u063c\u0005\u0003\u0000"+
		"\u0000\u063c\u0664\u0001\u0000\u0000\u0000\u063d\u063e\u0005\u008a\u0000"+
		"\u0000\u063e\u0640\u0005\u0002\u0000\u0000\u063f\u0641\u0005!\u0000\u0000"+
		"\u0640\u063f\u0001\u0000\u0000\u0000\u0640\u0641\u0001\u0000\u0000\u0000"+
		"\u0641\u0642\u0001\u0000\u0000\u0000\u0642\u0643\u0003\u00eew\u0000\u0643"+
		"\u0644\u0005\u0003\u0000\u0000\u0644\u0664\u0001\u0000\u0000\u0000\u0645"+
		"\u0646\u0005\u008b\u0000\u0000\u0646\u0648\u0005\u0002\u0000\u0000\u0647"+
		"\u0649\u0005!\u0000\u0000\u0648\u0647\u0001\u0000\u0000\u0000\u0648\u0649"+
		"\u0001\u0000\u0000\u0000\u0649\u064a\u0001\u0000\u0000\u0000\u064a\u064b"+
		"\u0003\u00eew\u0000\u064b\u064c\u0005\u0003\u0000\u0000\u064c\u0664\u0001"+
		"\u0000\u0000\u0000\u064d\u064e\u0005\u008c\u0000\u0000\u064e\u0650\u0005"+
		"\u0002\u0000\u0000\u064f\u0651\u0005!\u0000\u0000\u0650\u064f\u0001\u0000"+
		"\u0000\u0000\u0650\u0651\u0001\u0000\u0000\u0000\u0651\u0652\u0001\u0000"+
		"\u0000\u0000\u0652\u0653\u0003\u00eew\u0000\u0653\u0654\u0005\u0003\u0000"+
		"\u0000\u0654\u0664\u0001\u0000\u0000\u0000\u0655\u0656\u0005+\u0000\u0000"+
		"\u0656\u0658\u0005\u0002\u0000\u0000\u0657\u0659\u0005!\u0000\u0000\u0658"+
		"\u0657\u0001\u0000\u0000\u0000\u0658\u0659\u0001\u0000\u0000\u0000\u0659"+
		"\u065a\u0001\u0000\u0000\u0000\u065a\u065f\u0003\u00eew\u0000\u065b\u065c"+
		"\u0005\u0006\u0000\u0000\u065c\u065d\u0005\u008d\u0000\u0000\u065d\u065e"+
		"\u0005\u0014\u0000\u0000\u065e\u0660\u0003\u0130\u0098\u0000\u065f\u065b"+
		"\u0001\u0000\u0000\u0000\u065f\u0660\u0001\u0000\u0000\u0000\u0660\u0661"+
		"\u0001\u0000\u0000\u0000\u0661\u0662\u0005\u0003\u0000\u0000\u0662\u0664"+
		"\u0001\u0000\u0000\u0000\u0663\u061b\u0001\u0000\u0000\u0000\u0663\u0625"+
		"\u0001\u0000\u0000\u0000\u0663\u062d\u0001\u0000\u0000\u0000\u0663\u0635"+
		"\u0001\u0000\u0000\u0000\u0663\u063d\u0001\u0000\u0000\u0000\u0663\u0645"+
		"\u0001\u0000\u0000\u0000\u0663\u064d\u0001\u0000\u0000\u0000\u0663\u0655"+
		"\u0001\u0000\u0000\u0000\u0664\u0121\u0001\u0000\u0000\u0000\u0665\u0667"+
		"\u0003\u0132\u0099\u0000\u0666\u0668\u0003\u0096K\u0000\u0667\u0666\u0001"+
		"\u0000\u0000\u0000\u0667\u0668\u0001\u0000\u0000\u0000\u0668\u0123\u0001"+
		"\u0000\u0000\u0000\u0669\u066d\u0003\u0130\u0098\u0000\u066a\u066e\u0005"+
		"\u0094\u0000\u0000\u066b\u066c\u0005\u001b\u0000\u0000\u066c\u066e\u0003"+
		"\u0132\u0099\u0000\u066d\u066a\u0001\u0000\u0000\u0000\u066d\u066b\u0001"+
		"\u0000\u0000\u0000\u066d\u066e\u0001\u0000\u0000\u0000\u066e\u0125\u0001"+
		"\u0000\u0000\u0000\u066f\u0673\u0003\u0128\u0094\u0000\u0670\u0673\u0003"+
		"\u012a\u0095\u0000\u0671\u0673\u0003\u012c\u0096\u0000\u0672\u066f\u0001"+
		"\u0000\u0000\u0000\u0672\u0670\u0001\u0000\u0000\u0000\u0672\u0671\u0001"+
		"\u0000\u0000\u0000\u0673\u0127\u0001\u0000\u0000\u0000\u0674\u0675\u0007"+
		"\u0003\u0000\u0000\u0675\u0129\u0001\u0000\u0000\u0000\u0676\u0677\u0007"+
		"\u0004\u0000\u0000\u0677\u012b\u0001\u0000\u0000\u0000\u0678\u0679\u0007"+
		"\u0005\u0000\u0000\u0679\u012d\u0001\u0000\u0000\u0000\u067a\u067b\u0007"+
		"\u0006\u0000\u0000\u067b\u012f\u0001\u0000\u0000\u0000\u067c\u067d\u0007"+
		"\u0007\u0000\u0000\u067d\u0131\u0001\u0000\u0000\u0000\u067e\u0680\u0005"+
		"\u0095\u0000\u0000\u067f\u067e\u0001\u0000\u0000\u0000\u067f\u0680\u0001"+
		"\u0000\u0000\u0000\u0680\u0683\u0001\u0000\u0000\u0000\u0681\u0684\u0003"+
		"\u0138\u009c\u0000\u0682\u0684\u0003\u0134\u009a\u0000\u0683\u0681\u0001"+
		"\u0000\u0000\u0000\u0683\u0682\u0001\u0000\u0000\u0000\u0684\u0133\u0001"+
		"\u0000\u0000\u0000\u0685\u0688\u0003\u013a\u009d\u0000\u0686\u0688\u0003"+
		"\u013c\u009e\u0000\u0687\u0685\u0001\u0000\u0000\u0000\u0687\u0686\u0001"+
		"\u0000\u0000\u0000\u0688\u0135\u0001\u0000\u0000\u0000\u0689\u068a\u0007"+
		"\b\u0000\u0000\u068a\u0137\u0001\u0000\u0000\u0000\u068b\u068c\u0005\u008e"+
		"\u0000\u0000\u068c\u0139\u0001\u0000\u0000\u0000\u068d\u068e\u0005\u0090"+
		"\u0000\u0000\u068e\u013b\u0001\u0000\u0000\u0000\u068f\u0690\u0005\u008f"+
		"\u0000\u0000\u0690\u013d\u0001\u0000\u0000\u0000\u00a6\u0140\u0149\u014f"+
		"\u0151\u015f\u016c\u0171\u0174\u0178\u0187\u0190\u0196\u019a\u01a0\u01a3"+
		"\u01a8\u01ac\u01b4\u01bd\u01c7\u01cc\u01cf\u01d2\u01d5\u01db\u01e3\u01e8"+
		"\u01ee\u01f4\u01f9\u01ff\u0201\u0205\u0208\u020c\u020f\u0213\u0216\u021a"+
		"\u021d\u0221\u0224\u0228\u022b\u022d\u023a\u0240\u0242\u024f\u0253\u0258"+
		"\u025c\u0262\u0268\u026e\u0276\u027e\u0292\u0296\u0299\u029e\u02ae\u02b2"+
		"\u02b5\u02be\u02c9\u02cd\u02d0\u02d4\u02db\u02e4\u02e8\u02ed\u02f2\u02f7"+
		"\u02fc\u02ff\u0304\u0306\u0310\u031b\u032c\u0333\u033d\u0341\u0347\u0350"+
		"\u0355\u035c\u0366\u036f\u0377\u037e\u0383\u038c\u0391\u0395\u039c\u039e"+
		"\u03a6\u03a9\u03b1\u03b5\u03ba\u03c1\u03cc\u03cf\u03d4\u03d8\u03e7\u03ee"+
		"\u03fa\u0402\u0407\u040c\u0415\u0417\u041b\u0429\u0432\u0435\u0438\u043f"+
		"\u0441\u0447\u044f\u0459\u0461\u0467\u046b\u046f\u0473\u047d\u0486\u048e"+
		"\u04a5\u04ad\u04b5\u04bd\u04c2\u04c9\u04ce\u04dd\u04e6\u0514\u05ea\u05f3"+
		"\u0603\u0610\u061e\u0622\u0628\u0630\u0638\u0640\u0648\u0650\u0658\u065f"+
		"\u0663\u0667\u066d\u0672\u067f\u0683\u0687";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}