// $ANTLR 3.5 /Users/albr/Documents/workspace/parser/src/TheLang.g 2013-08-26 16:19:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TheLangLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int COLON=6;
	public static final int COMMENT=7;
	public static final int DIV=8;
	public static final int DO=9;
	public static final int ELSE=10;
	public static final int END=11;
	public static final int EQ=12;
	public static final int FALSE=13;
	public static final int FI=14;
	public static final int GE=15;
	public static final int GT=16;
	public static final int HIGH=17;
	public static final int IDENTIFIER=18;
	public static final int IF=19;
	public static final int INT=20;
	public static final int INTEGER=21;
	public static final int LBRACE=22;
	public static final int LBRACKET=23;
	public static final int LE=24;
	public static final int LETTER=25;
	public static final int LOW=26;
	public static final int LPAREN=27;
	public static final int LT=28;
	public static final int MINUS=29;
	public static final int MUL=30;
	public static final int NEQ=31;
	public static final int NOT=32;
	public static final int OD=33;
	public static final int OR=34;
	public static final int PLUS=35;
	public static final int PROGRAM=36;
	public static final int RBRACE=37;
	public static final int RBRACKET=38;
	public static final int READ=39;
	public static final int RPAREN=40;
	public static final int SEMI=41;
	public static final int SKIP=42;
	public static final int THEN=43;
	public static final int TRUE=44;
	public static final int WHILE=45;
	public static final int WRITE=46;
	public static final int WS=47;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public TheLangLexer() {} 
	public TheLangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public TheLangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/albr/Documents/workspace/parser/src/TheLang.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:7:5: ( '&' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:7:7: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:8:8: ( ':=' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:8:10: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:9:7: ( ':' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:9:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:10:5: ( '/' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:10:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:11:4: ( 'do' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:11:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:12:6: ( 'else' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:12:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:13:5: ( 'end' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:13:7: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:14:4: ( '=' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:14:6: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:15:7: ( 'false' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:15:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "FI"
	public final void mFI() throws RecognitionException {
		try {
			int _type = FI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:16:4: ( 'fi' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:16:6: 'fi'
			{
			match("fi"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FI"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:17:4: ( '>=' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:17:6: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:18:4: ( '>' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:18:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "HIGH"
	public final void mHIGH() throws RecognitionException {
		try {
			int _type = HIGH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:19:6: ( 'high' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:19:8: 'high'
			{
			match("high"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HIGH"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:20:4: ( 'if' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:20:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:21:5: ( 'int' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:21:7: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:22:8: ( '{' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:22:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACE"

	// $ANTLR start "LBRACKET"
	public final void mLBRACKET() throws RecognitionException {
		try {
			int _type = LBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:23:10: ( '[' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:23:12: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACKET"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:24:4: ( '<=' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:24:6: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "LOW"
	public final void mLOW() throws RecognitionException {
		try {
			int _type = LOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:25:5: ( 'low' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:25:7: 'low'
			{
			match("low"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOW"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:26:8: ( '(' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:26:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:27:4: ( '<' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:27:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:28:7: ( '-' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:28:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:29:5: ( '*' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:29:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:30:5: ( '!=' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:30:7: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:31:5: ( '!' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:31:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "OD"
	public final void mOD() throws RecognitionException {
		try {
			int _type = OD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:32:4: ( 'od' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:32:6: 'od'
			{
			match("od"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OD"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:33:4: ( '|' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:33:6: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:34:6: ( '+' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:34:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "PROGRAM"
	public final void mPROGRAM() throws RecognitionException {
		try {
			int _type = PROGRAM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:35:9: ( 'program' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:35:11: 'program'
			{
			match("program"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROGRAM"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:36:8: ( '}' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:36:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACE"

	// $ANTLR start "RBRACKET"
	public final void mRBRACKET() throws RecognitionException {
		try {
			int _type = RBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:37:10: ( ']' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:37:12: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACKET"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:38:6: ( 'read' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:38:8: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:39:8: ( ')' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:39:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:40:6: ( ';' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:40:8: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "SKIP"
	public final void mSKIP() throws RecognitionException {
		try {
			int _type = SKIP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:41:6: ( 'skip' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:41:8: 'skip'
			{
			match("skip"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SKIP"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:42:6: ( 'then' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:42:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:43:6: ( 'true' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:43:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:44:7: ( 'while' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:44:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "WRITE"
	public final void mWRITE() throws RecognitionException {
		try {
			int _type = WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:45:7: ( 'write' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:45:9: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WRITE"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:124:9: ( '(*' ( options {greedy=false; } : . )* '*)' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:124:11: '(*' ( options {greedy=false; } : . )* '*)'
			{
			match("(*"); 

			// /Users/albr/Documents/workspace/parser/src/TheLang.g:124:16: ( options {greedy=false; } : . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='*') ) {
					int LA1_1 = input.LA(2);
					if ( (LA1_1==')') ) {
						alt1=2;
					}
					else if ( ((LA1_1 >= '\u0000' && LA1_1 <= '(')||(LA1_1 >= '*' && LA1_1 <= '\uFFFF')) ) {
						alt1=1;
					}

				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= ')')||(LA1_0 >= '+' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/albr/Documents/workspace/parser/src/TheLang.g:124:43: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop1;
				}
			}

			match("*)"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:127:9: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:127:11: ( '0' | '1' .. '9' ( '0' .. '9' )* )
			{
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:127:11: ( '0' | '1' .. '9' ( '0' .. '9' )* )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='0') ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /Users/albr/Documents/workspace/parser/src/TheLang.g:127:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// /Users/albr/Documents/workspace/parser/src/TheLang.g:127:18: '1' .. '9' ( '0' .. '9' )*
					{
					matchRange('1','9'); 
					// /Users/albr/Documents/workspace/parser/src/TheLang.g:127:27: ( '0' .. '9' )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// /Users/albr/Documents/workspace/parser/src/TheLang.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop2;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:129:12: ( LETTER ( LETTER | '0' .. '9' )* )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:129:14: LETTER ( LETTER | '0' .. '9' )*
			{
			mLETTER(); 

			// /Users/albr/Documents/workspace/parser/src/TheLang.g:129:21: ( LETTER | '0' .. '9' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/albr/Documents/workspace/parser/src/TheLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:133:8: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:137:4: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
			// /Users/albr/Documents/workspace/parser/src/TheLang.g:137:6: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:8: ( AND | ASSIGN | COLON | DIV | DO | ELSE | END | EQ | FALSE | FI | GE | GT | HIGH | IF | INT | LBRACE | LBRACKET | LE | LOW | LPAREN | LT | MINUS | MUL | NEQ | NOT | OD | OR | PLUS | PROGRAM | RBRACE | RBRACKET | READ | RPAREN | SEMI | SKIP | THEN | TRUE | WHILE | WRITE | COMMENT | INTEGER | IDENTIFIER | WS )
		int alt5=43;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:14: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 3 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:21: COLON
				{
				mCOLON(); 

				}
				break;
			case 4 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:27: DIV
				{
				mDIV(); 

				}
				break;
			case 5 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:31: DO
				{
				mDO(); 

				}
				break;
			case 6 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:34: ELSE
				{
				mELSE(); 

				}
				break;
			case 7 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:39: END
				{
				mEND(); 

				}
				break;
			case 8 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:43: EQ
				{
				mEQ(); 

				}
				break;
			case 9 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:46: FALSE
				{
				mFALSE(); 

				}
				break;
			case 10 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:52: FI
				{
				mFI(); 

				}
				break;
			case 11 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:55: GE
				{
				mGE(); 

				}
				break;
			case 12 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:58: GT
				{
				mGT(); 

				}
				break;
			case 13 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:61: HIGH
				{
				mHIGH(); 

				}
				break;
			case 14 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:66: IF
				{
				mIF(); 

				}
				break;
			case 15 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:69: INT
				{
				mINT(); 

				}
				break;
			case 16 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:73: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 17 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:80: LBRACKET
				{
				mLBRACKET(); 

				}
				break;
			case 18 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:89: LE
				{
				mLE(); 

				}
				break;
			case 19 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:92: LOW
				{
				mLOW(); 

				}
				break;
			case 20 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:96: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 21 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:103: LT
				{
				mLT(); 

				}
				break;
			case 22 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:106: MINUS
				{
				mMINUS(); 

				}
				break;
			case 23 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:112: MUL
				{
				mMUL(); 

				}
				break;
			case 24 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:116: NEQ
				{
				mNEQ(); 

				}
				break;
			case 25 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:120: NOT
				{
				mNOT(); 

				}
				break;
			case 26 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:124: OD
				{
				mOD(); 

				}
				break;
			case 27 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:127: OR
				{
				mOR(); 

				}
				break;
			case 28 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:130: PLUS
				{
				mPLUS(); 

				}
				break;
			case 29 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:135: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 30 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:143: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 31 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:150: RBRACKET
				{
				mRBRACKET(); 

				}
				break;
			case 32 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:159: READ
				{
				mREAD(); 

				}
				break;
			case 33 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:164: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 34 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:171: SEMI
				{
				mSEMI(); 

				}
				break;
			case 35 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:176: SKIP
				{
				mSKIP(); 

				}
				break;
			case 36 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:181: THEN
				{
				mTHEN(); 

				}
				break;
			case 37 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:186: TRUE
				{
				mTRUE(); 

				}
				break;
			case 38 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:191: WHILE
				{
				mWHILE(); 

				}
				break;
			case 39 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:197: WRITE
				{
				mWRITE(); 

				}
				break;
			case 40 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:203: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 41 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:211: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 42 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:219: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 43 :
				// /Users/albr/Documents/workspace/parser/src/TheLang.g:1:230: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\2\uffff\1\43\1\uffff\2\40\1\uffff\1\40\1\52\2\40\2\uffff\1\57\1\40\1"+
		"\62\2\uffff\1\64\1\40\2\uffff\1\40\2\uffff\1\40\2\uffff\3\40\5\uffff\1"+
		"\75\3\40\1\101\2\uffff\1\40\1\103\1\40\2\uffff\1\40\4\uffff\1\106\7\40"+
		"\1\uffff\1\40\1\117\1\40\1\uffff\1\40\1\uffff\1\122\1\123\1\uffff\7\40"+
		"\1\133\1\uffff\1\40\1\135\2\uffff\1\40\1\137\1\140\1\141\1\142\2\40\1"+
		"\uffff\1\145\1\uffff\1\40\4\uffff\1\147\1\150\1\uffff\1\40\2\uffff\1\152"+
		"\1\uffff";
	static final String DFA5_eofS =
		"\153\uffff";
	static final String DFA5_minS =
		"\1\11\1\uffff\1\75\1\uffff\1\157\1\154\1\uffff\1\141\1\75\1\151\1\146"+
		"\2\uffff\1\75\1\157\1\52\2\uffff\1\75\1\144\2\uffff\1\162\2\uffff\1\145"+
		"\2\uffff\1\153\2\150\5\uffff\1\60\1\163\1\144\1\154\1\60\2\uffff\1\147"+
		"\1\60\1\164\2\uffff\1\167\4\uffff\1\60\1\157\1\141\1\151\1\145\1\165\2"+
		"\151\1\uffff\1\145\1\60\1\163\1\uffff\1\150\1\uffff\2\60\1\uffff\1\147"+
		"\1\144\1\160\1\156\1\145\1\154\1\164\1\60\1\uffff\1\145\1\60\2\uffff\1"+
		"\162\4\60\2\145\1\uffff\1\60\1\uffff\1\141\4\uffff\2\60\1\uffff\1\155"+
		"\2\uffff\1\60\1\uffff";
	static final String DFA5_maxS =
		"\1\175\1\uffff\1\75\1\uffff\1\157\1\156\1\uffff\1\151\1\75\1\151\1\156"+
		"\2\uffff\1\75\1\157\1\52\2\uffff\1\75\1\144\2\uffff\1\162\2\uffff\1\145"+
		"\2\uffff\1\153\2\162\5\uffff\1\172\1\163\1\144\1\154\1\172\2\uffff\1\147"+
		"\1\172\1\164\2\uffff\1\167\4\uffff\1\172\1\157\1\141\1\151\1\145\1\165"+
		"\2\151\1\uffff\1\145\1\172\1\163\1\uffff\1\150\1\uffff\2\172\1\uffff\1"+
		"\147\1\144\1\160\1\156\1\145\1\154\1\164\1\172\1\uffff\1\145\1\172\2\uffff"+
		"\1\162\4\172\2\145\1\uffff\1\172\1\uffff\1\141\4\uffff\2\172\1\uffff\1"+
		"\155\2\uffff\1\172\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\uffff\1\4\2\uffff\1\10\4\uffff\1\20\1\21\3\uffff\1\26\1"+
		"\27\2\uffff\1\33\1\34\1\uffff\1\36\1\37\1\uffff\1\41\1\42\3\uffff\1\51"+
		"\1\52\1\53\1\2\1\3\5\uffff\1\13\1\14\3\uffff\1\22\1\25\1\uffff\1\50\1"+
		"\24\1\30\1\31\10\uffff\1\5\3\uffff\1\12\1\uffff\1\16\2\uffff\1\32\10\uffff"+
		"\1\7\2\uffff\1\17\1\23\7\uffff\1\6\1\uffff\1\15\1\uffff\1\40\1\43\1\44"+
		"\1\45\2\uffff\1\11\1\uffff\1\46\1\47\1\uffff\1\35";
	static final String DFA5_specialS =
		"\153\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\41\1\uffff\2\41\22\uffff\1\41\1\22\4\uffff\1\1\1\uffff\1\17\1\32\1"+
			"\21\1\25\1\uffff\1\20\1\uffff\1\3\12\37\1\2\1\33\1\15\1\6\1\10\2\uffff"+
			"\32\40\1\14\1\uffff\1\30\1\uffff\1\40\1\uffff\3\40\1\4\1\5\1\7\1\40\1"+
			"\11\1\12\2\40\1\16\2\40\1\23\1\26\1\40\1\31\1\34\1\35\2\40\1\36\3\40"+
			"\1\13\1\24\1\27",
			"",
			"\1\42",
			"",
			"\1\44",
			"\1\45\1\uffff\1\46",
			"",
			"\1\47\7\uffff\1\50",
			"\1\51",
			"\1\53",
			"\1\54\7\uffff\1\55",
			"",
			"",
			"\1\56",
			"\1\60",
			"\1\61",
			"",
			"",
			"\1\63",
			"\1\65",
			"",
			"",
			"\1\66",
			"",
			"",
			"\1\67",
			"",
			"",
			"\1\70",
			"\1\71\11\uffff\1\72",
			"\1\73\11\uffff\1\74",
			"",
			"",
			"",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\76",
			"\1\77",
			"\1\100",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"\1\102",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\104",
			"",
			"",
			"\1\105",
			"",
			"",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"",
			"\1\116",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\120",
			"",
			"\1\121",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\134",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"\1\136",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\143",
			"\1\144",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\146",
			"",
			"",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\151",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | ASSIGN | COLON | DIV | DO | ELSE | END | EQ | FALSE | FI | GE | GT | HIGH | IF | INT | LBRACE | LBRACKET | LE | LOW | LPAREN | LT | MINUS | MUL | NEQ | NOT | OD | OR | PLUS | PROGRAM | RBRACE | RBRACKET | READ | RPAREN | SEMI | SKIP | THEN | TRUE | WHILE | WRITE | COMMENT | INTEGER | IDENTIFIER | WS );";
		}
	}

}
