// Generated from C:/Users/AdamGaafar23/Desktop/simpler-master/simpler-master/src/Alang/Alang.g4 by ANTLR 4.13.1
package Alang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AlangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, STRING=6, NEWLINE=7, INT=8, LPAREN=9, 
		RPAREN=10, TIMES=11, DIVIDE=12, PLUS=13, MINUS=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "ID", "STRING", "NEWLINE", "INT", "LPAREN", 
			"RPAREN", "TIMES", "DIVIDE", "PLUS", "MINUS", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'='", "';'", "'print'", null, null, null, null, "'('", 
			"')'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "ID", "STRING", "NEWLINE", "INT", "LPAREN", 
			"RPAREN", "TIMES", "DIVIDE", "PLUS", "MINUS", "WS"
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


	public AlangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000fX\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0004\u0004/\b\u0004\u000b\u0004\f\u0004"+
		"0\u0001\u0005\u0001\u0005\u0005\u00055\b\u0005\n\u0005\f\u00058\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006=\b\u0006\u000b\u0006"+
		"\f\u0006>\u0001\u0007\u0004\u0007B\b\u0007\u000b\u0007\f\u0007C\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0004\u000eS\b\u000e\u000b\u000e"+
		"\f\u000eT\u0001\u000e\u0001\u000e\u00016\u0000\u000f\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000"+
		"\u0004\u0002\u0000AZaz\u0002\u0000\n\n\r\r\u0001\u000009\u0002\u0000\t"+
		"\t  \\\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003"+
		"#\u0001\u0000\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007\'\u0001"+
		"\u0000\u0000\u0000\t.\u0001\u0000\u0000\u0000\u000b2\u0001\u0000\u0000"+
		"\u0000\r<\u0001\u0000\u0000\u0000\u000fA\u0001\u0000\u0000\u0000\u0011"+
		"E\u0001\u0000\u0000\u0000\u0013G\u0001\u0000\u0000\u0000\u0015I\u0001"+
		"\u0000\u0000\u0000\u0017K\u0001\u0000\u0000\u0000\u0019M\u0001\u0000\u0000"+
		"\u0000\u001bO\u0001\u0000\u0000\u0000\u001dR\u0001\u0000\u0000\u0000\u001f"+
		" \u0005v\u0000\u0000 !\u0005a\u0000\u0000!\"\u0005r\u0000\u0000\"\u0002"+
		"\u0001\u0000\u0000\u0000#$\u0005=\u0000\u0000$\u0004\u0001\u0000\u0000"+
		"\u0000%&\u0005;\u0000\u0000&\u0006\u0001\u0000\u0000\u0000\'(\u0005p\u0000"+
		"\u0000()\u0005r\u0000\u0000)*\u0005i\u0000\u0000*+\u0005n\u0000\u0000"+
		"+,\u0005t\u0000\u0000,\b\u0001\u0000\u0000\u0000-/\u0007\u0000\u0000\u0000"+
		".-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001\n\u0001\u0000\u0000\u000026\u0005\""+
		"\u0000\u000035\t\u0000\u0000\u000043\u0001\u0000\u0000\u000058\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000079\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\"\u0000\u0000:\f"+
		"\u0001\u0000\u0000\u0000;=\u0007\u0001\u0000\u0000<;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?\u000e\u0001\u0000\u0000\u0000@B\u0007\u0002\u0000\u0000"+
		"A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000D\u0010\u0001\u0000\u0000\u0000EF\u0005"+
		"(\u0000\u0000F\u0012\u0001\u0000\u0000\u0000GH\u0005)\u0000\u0000H\u0014"+
		"\u0001\u0000\u0000\u0000IJ\u0005*\u0000\u0000J\u0016\u0001\u0000\u0000"+
		"\u0000KL\u0005/\u0000\u0000L\u0018\u0001\u0000\u0000\u0000MN\u0005+\u0000"+
		"\u0000N\u001a\u0001\u0000\u0000\u0000OP\u0005-\u0000\u0000P\u001c\u0001"+
		"\u0000\u0000\u0000QS\u0007\u0003\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VW\u0006\u000e\u0000\u0000W\u001e\u0001"+
		"\u0000\u0000\u0000\u0006\u000006>CT\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}