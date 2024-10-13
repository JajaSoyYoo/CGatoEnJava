// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/act5/LexerTL.flex


package act5;
import java_cup.runtime.*;


@SuppressWarnings("fallthrough")
public class LexerTL implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\1\1\5"+
    "\1\6\3\0\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\11\22\1\0\1\23"+
    "\1\24\1\25\1\26\2\0\32\27\1\30\1\31\1\32"+
    "\1\0\1\33\1\0\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\27\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\27\1\53\1\54\1\55\1\56"+
    "\1\57\1\60\3\27\1\61\1\62\1\63\7\0\1\3"+
    "\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\3\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\1\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\15\20\1\23\1\1"+
    "\1\24\1\0\1\25\1\0\1\26\1\0\1\27\1\0"+
    "\1\30\1\31\3\0\1\32\1\33\1\34\7\20\1\35"+
    "\14\20\1\36\1\37\1\40\1\0\1\41\6\20\1\42"+
    "\1\43\1\20\1\44\13\20\1\45\1\46\1\47\1\20"+
    "\1\50\13\20\1\51\1\20\1\52\1\20\1\53\1\54"+
    "\1\55\11\20\1\56\1\57\5\20\1\60\1\61\1\62"+
    "\1\63\2\20\1\64\1\65\1\20\1\66\2\20\1\67"+
    "\1\70";

  private static int [] zzUnpackAction() {
    int [] result = new int[154];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\64"+
    "\0\64\0\64\0\u016c\0\64\0\u01a0\0\64\0\u01d4\0\u0208"+
    "\0\u023c\0\64\0\u0270\0\u02a4\0\u02d8\0\u030c\0\64\0\64"+
    "\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478\0\u04ac"+
    "\0\u04e0\0\u0514\0\u0548\0\u057c\0\u05b0\0\64\0\u05e4\0\64"+
    "\0\u0618\0\64\0\320\0\64\0\u064c\0\64\0\u0680\0\64"+
    "\0\64\0\u06b4\0\u06e8\0\u0208\0\64\0\64\0\64\0\u071c"+
    "\0\u0750\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u030c\0\u0888"+
    "\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c\0\u09c0\0\u09f4\0\u0a28"+
    "\0\u0a5c\0\u0a90\0\u0ac4\0\64\0\u0af8\0\64\0\u0b2c\0\u06e8"+
    "\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u030c\0\u0c98"+
    "\0\u0ccc\0\u030c\0\u0d00\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0\0\u0e04"+
    "\0\u0e38\0\u0e6c\0\u0ea0\0\u0ed4\0\u0f08\0\64\0\u030c\0\u030c"+
    "\0\u0f3c\0\u030c\0\u0f70\0\u0fa4\0\u0fd8\0\u100c\0\u1040\0\u1074"+
    "\0\u10a8\0\u10dc\0\u1110\0\u1144\0\u1178\0\u030c\0\u11ac\0\u030c"+
    "\0\u11e0\0\u030c\0\u030c\0\u030c\0\u1214\0\u1248\0\u127c\0\u12b0"+
    "\0\u12e4\0\u1318\0\u134c\0\u1380\0\u13b4\0\u030c\0\u030c\0\u13e8"+
    "\0\u141c\0\u1450\0\u1484\0\u14b8\0\u030c\0\u030c\0\u030c\0\u030c"+
    "\0\u14ec\0\u1520\0\u030c\0\u030c\0\u1554\0\u030c\0\u1588\0\u15bc"+
    "\0\u030c\0\u030c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[154];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\2\1\30\2\26\1\31\1\32\1\26\1\33\1\34"+
    "\2\26\1\35\3\26\1\36\1\26\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\104\0"+
    "\1\51\70\0\1\52\36\0\2\53\1\0\3\53\1\54"+
    "\22\53\1\55\32\53\7\0\1\56\54\0\2\57\3\0"+
    "\57\57\14\0\1\60\65\0\1\61\60\0\1\62\67\0"+
    "\1\63\1\0\2\64\60\0\1\63\1\0\1\64\1\21"+
    "\66\0\1\65\63\0\1\66\63\0\1\67\57\0\2\26"+
    "\4\0\1\26\4\0\25\26\24\0\2\26\4\0\1\26"+
    "\4\0\15\26\1\70\7\26\24\0\2\26\4\0\1\26"+
    "\4\0\7\26\1\71\2\26\1\72\12\26\24\0\2\26"+
    "\4\0\1\26\4\0\12\26\1\73\12\26\24\0\2\26"+
    "\4\0\1\26\4\0\1\74\11\26\1\75\2\26\1\76"+
    "\7\26\24\0\2\26\4\0\1\26\4\0\5\26\1\77"+
    "\6\26\1\100\10\26\24\0\2\26\4\0\1\26\4\0"+
    "\1\101\3\26\1\102\20\26\24\0\2\26\4\0\1\26"+
    "\4\0\1\103\16\26\1\104\2\26\1\105\2\26\24\0"+
    "\2\26\4\0\1\26\4\0\4\26\1\106\20\26\24\0"+
    "\2\26\4\0\1\26\4\0\21\26\1\107\3\26\24\0"+
    "\2\26\4\0\1\26\4\0\17\26\1\110\5\26\24\0"+
    "\2\26\4\0\1\26\4\0\20\26\1\111\4\26\24\0"+
    "\2\26\4\0\1\26\4\0\15\26\1\112\7\26\24\0"+
    "\2\26\4\0\1\26\4\0\7\26\1\113\15\26\65\0"+
    "\1\114\21\0\1\115\43\0\2\53\3\0\57\53\10\0"+
    "\1\116\53\0\13\62\1\117\50\62\21\0\2\120\62\0"+
    "\2\26\4\0\1\26\4\0\15\26\1\121\7\26\24\0"+
    "\2\26\4\0\1\26\4\0\1\122\24\26\24\0\2\26"+
    "\4\0\1\26\4\0\1\123\24\26\24\0\2\26\4\0"+
    "\1\26\4\0\20\26\1\124\4\26\24\0\2\26\4\0"+
    "\1\26\4\0\12\26\1\125\12\26\24\0\2\26\4\0"+
    "\1\26\4\0\15\26\1\126\7\26\24\0\2\26\4\0"+
    "\1\26\4\0\17\26\1\127\5\26\24\0\2\26\4\0"+
    "\1\26\4\0\21\26\1\130\3\26\24\0\2\26\4\0"+
    "\1\26\4\0\13\26\1\131\11\26\24\0\2\26\4\0"+
    "\1\26\4\0\24\26\1\132\24\0\2\26\4\0\1\26"+
    "\4\0\2\26\1\133\22\26\24\0\2\26\4\0\1\26"+
    "\4\0\10\26\1\134\4\26\1\135\7\26\24\0\2\26"+
    "\4\0\1\26\4\0\1\26\1\136\23\26\24\0\2\26"+
    "\4\0\1\26\4\0\21\26\1\137\3\26\24\0\2\26"+
    "\4\0\1\26\4\0\1\140\16\26\1\141\5\26\24\0"+
    "\2\26\4\0\1\26\4\0\22\26\1\142\2\26\24\0"+
    "\2\26\4\0\1\26\4\0\10\26\1\143\14\26\24\0"+
    "\2\26\4\0\1\26\4\0\10\26\1\144\14\26\24\0"+
    "\2\26\4\0\1\26\4\0\10\26\1\145\14\26\3\0"+
    "\2\115\3\0\57\115\20\0\1\146\64\0\2\26\4\0"+
    "\1\26\4\0\12\26\1\147\12\26\24\0\2\26\4\0"+
    "\1\26\4\0\17\26\1\150\5\26\24\0\2\26\4\0"+
    "\1\26\4\0\20\26\1\151\4\26\24\0\2\26\4\0"+
    "\1\26\4\0\4\26\1\152\20\26\24\0\2\26\4\0"+
    "\1\26\4\0\20\26\1\153\4\26\24\0\2\26\4\0"+
    "\1\26\4\0\1\154\24\26\24\0\2\26\4\0\1\26"+
    "\4\0\4\26\1\155\20\26\24\0\2\26\4\0\1\26"+
    "\4\0\4\26\1\156\20\26\24\0\2\26\4\0\1\26"+
    "\4\0\11\26\1\157\13\26\24\0\2\26\4\0\1\26"+
    "\4\0\23\26\1\160\1\26\24\0\2\26\4\0\1\26"+
    "\4\0\21\26\1\161\3\26\24\0\2\26\4\0\1\26"+
    "\4\0\12\26\1\162\12\26\24\0\2\26\4\0\1\26"+
    "\4\0\22\26\1\163\2\26\24\0\2\26\4\0\1\26"+
    "\4\0\21\26\1\164\3\26\24\0\2\26\4\0\1\26"+
    "\4\0\10\26\1\165\14\26\24\0\2\26\4\0\1\26"+
    "\4\0\4\26\1\166\20\26\24\0\2\26\4\0\1\26"+
    "\4\0\14\26\1\167\10\26\24\0\2\26\4\0\1\26"+
    "\4\0\3\26\1\170\21\26\24\0\2\26\4\0\1\26"+
    "\4\0\12\26\1\171\12\26\24\0\2\26\4\0\1\26"+
    "\4\0\20\26\1\172\4\26\24\0\2\26\4\0\1\26"+
    "\4\0\4\26\1\173\20\26\24\0\2\26\4\0\1\26"+
    "\4\0\21\26\1\174\3\26\24\0\2\26\4\0\1\26"+
    "\4\0\17\26\1\175\5\26\24\0\2\26\4\0\1\26"+
    "\4\0\20\26\1\176\4\26\24\0\2\26\4\0\1\26"+
    "\4\0\1\177\24\26\24\0\2\26\4\0\1\26\4\0"+
    "\1\200\24\26\24\0\2\26\4\0\1\26\4\0\4\26"+
    "\1\201\20\26\24\0\2\26\4\0\1\26\4\0\10\26"+
    "\1\202\14\26\24\0\2\26\4\0\1\26\4\0\17\26"+
    "\1\203\5\26\24\0\2\26\4\0\1\26\4\0\10\26"+
    "\1\204\14\26\24\0\2\26\4\0\1\26\4\0\14\26"+
    "\1\205\10\26\24\0\2\26\4\0\1\26\4\0\6\26"+
    "\1\206\16\26\24\0\2\26\4\0\1\26\4\0\4\26"+
    "\1\207\20\26\24\0\2\26\4\0\1\26\4\0\14\26"+
    "\1\210\10\26\24\0\2\26\4\0\1\26\4\0\16\26"+
    "\1\211\6\26\24\0\2\26\4\0\1\26\4\0\6\26"+
    "\1\212\16\26\24\0\2\26\4\0\1\26\4\0\21\26"+
    "\1\213\3\26\24\0\2\26\4\0\1\26\4\0\2\26"+
    "\1\214\22\26\24\0\2\26\4\0\1\26\4\0\2\26"+
    "\1\215\22\26\24\0\2\26\4\0\1\26\4\0\14\26"+
    "\1\216\10\26\24\0\2\26\4\0\1\26\4\0\2\26"+
    "\1\217\22\26\24\0\2\26\4\0\1\26\4\0\6\26"+
    "\1\220\16\26\24\0\2\26\4\0\1\26\4\0\1\221"+
    "\24\26\24\0\2\26\4\0\1\26\4\0\1\222\24\26"+
    "\24\0\2\26\4\0\1\26\4\0\4\26\1\223\20\26"+
    "\24\0\2\26\4\0\1\26\4\0\4\26\1\224\20\26"+
    "\24\0\2\26\4\0\1\26\4\0\21\26\1\225\3\26"+
    "\24\0\2\26\4\0\1\26\4\0\12\26\1\226\12\26"+
    "\24\0\2\26\4\0\1\26\4\0\2\26\1\227\22\26"+
    "\24\0\2\26\4\0\1\26\4\0\4\26\1\230\20\26"+
    "\24\0\2\26\4\0\1\26\4\0\4\26\1\231\20\26"+
    "\24\0\2\26\4\0\1\26\4\0\3\26\1\232\21\26"+
    "\3\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[5616];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\5\1\3\11\1\1\1\11\1\1\1\11"+
    "\3\1\1\11\4\1\2\11\15\1\1\11\1\1\1\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\1\0\2\11"+
    "\3\0\3\11\24\1\1\11\1\1\1\11\1\0\26\1"+
    "\1\11\64\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[154];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    private void description(String token, String mensaje)
    {
        System.out.println("Linea: "+(yyline+1)+" Columna: "+(yycolumn+1)+" token: "+token+" --> "+mensaje);
    }
    private Symbol symbol(int type, Object value)
    {
        return new Symbol(type, (yyline+1), (yycolumn+1), value);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexerTL(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.print(yytext());
            }
          // fall through
          case 57: break;
          case 2:
            { description(yytext(),"Negacion"); return symbol(sym.NEGACION, yytext());
            }
          // fall through
          case 58: break;
          case 3:
            { description(yytext(),"Parentesis izquierdo"); return symbol(sym.PARENTESIS_IZQUIERDO, yytext());
            }
          // fall through
          case 59: break;
          case 4:
            { description(yytext(),"Parentesis derecho"); return symbol(sym.PARENTESIS_DERECHO, yytext());
            }
          // fall through
          case 60: break;
          case 5:
            { description(yytext(),"Multiplicacion"); return symbol(sym.MULTIPLICACION, yytext());
            }
          // fall through
          case 61: break;
          case 6:
            { description(yytext(),"Suma"); return symbol(sym.SUMA, yytext());
            }
          // fall through
          case 62: break;
          case 7:
            { description(yytext(),"Coma"); return symbol(sym.COMA, yytext());
            }
          // fall through
          case 63: break;
          case 8:
            { description(yytext(),"Resta"); return symbol(sym.RESTA, yytext());
            }
          // fall through
          case 64: break;
          case 9:
            { description(yytext(),"Punto"); return symbol(sym.PUNTO, yytext());
            }
          // fall through
          case 65: break;
          case 10:
            { description(yytext(),"Division"); return symbol(sym.DIVISION, yytext());
            }
          // fall through
          case 66: break;
          case 11:
            { description(yytext(),"Numero entero"); return symbol(sym.NENTERO, yytext());
            }
          // fall through
          case 67: break;
          case 12:
            { description(yytext(),"Punto y coma"); return symbol(sym.PUNTO_COMA, yytext());
            }
          // fall through
          case 68: break;
          case 13:
            { description(yytext(),"Menor que"); return symbol(sym.MENOR_QUE, yytext());
            }
          // fall through
          case 69: break;
          case 14:
            { description(yytext(),"Asignacion"); return symbol(sym.ASIGNACION, yytext());
            }
          // fall through
          case 70: break;
          case 15:
            { description(yytext(),"Mayor que"); return symbol(sym.MAYOR_QUE, yytext());
            }
          // fall through
          case 71: break;
          case 16:
            { description(yytext(),"Identificador"); return symbol(sym.IDENTIFICADOR, yytext());
            }
          // fall through
          case 72: break;
          case 17:
            { description(yytext(),"Corchete izquierdo"); return symbol(sym.CORCHETE_IZQUIERDO, yytext());
            }
          // fall through
          case 73: break;
          case 18:
            { description(yytext(),"Corchete derecho"); return symbol(sym.CORCHETE_DERECHO, yytext());
            }
          // fall through
          case 74: break;
          case 19:
            { description(yytext(),"Llave izquierda"); return symbol(sym.LLAVE_IZQUIERDA, yytext());
            }
          // fall through
          case 75: break;
          case 20:
            { description(yytext(),"Llave derecha"); return symbol(sym.LLAVE_DERECHA, yytext());
            }
          // fall through
          case 76: break;
          case 21:
            { description(yytext(),"Desigualdad"); return symbol(sym.DESIGUALDAD, yytext());
            }
          // fall through
          case 77: break;
          case 22:
            { description(yytext(),"Cadena"); return symbol(sym.CADENA, yytext());
            }
          // fall through
          case 78: break;
          case 23:
            { description(yytext(),"Y logico"); return symbol(sym.Y_LOGICO, yytext());
            }
          // fall through
          case 79: break;
          case 24:
            { description(yytext(),"Negacion"); return symbol(sym.INCREMENTO, yytext());
            }
          // fall through
          case 80: break;
          case 25:
            { description(yytext(),"Negacion"); return symbol(sym.DECREMENTO, yytext());
            }
          // fall through
          case 81: break;
          case 26:
            { description(yytext(),"Menor o igual que"); return symbol(sym.MENOR_O_IGUAL_QUE, yytext());
            }
          // fall through
          case 82: break;
          case 27:
            { description(yytext(),"Igualdad"); return symbol(sym.IGUALDAD, yytext());
            }
          // fall through
          case 83: break;
          case 28:
            { description(yytext(),"Mayor o igual que"); return symbol(sym.MAYOR_O_IGUAL_QUE, yytext());
            }
          // fall through
          case 84: break;
          case 29:
            { description(yytext(),"Declaracion condicional"); return symbol(sym.IF, yytext());
            }
          // fall through
          case 85: break;
          case 30:
            { description(yytext(),"O logico"); return symbol(sym.O_LOGICO, yytext());
            }
          // fall through
          case 86: break;
          case 31:
            { description(yytext(),"Comentario de una linea");
            }
          // fall through
          case 87: break;
          case 32:
            { description(yytext(),"Caracter"); return symbol(sym.CARACTER, yytext());
            }
          // fall through
          case 88: break;
          case 33:
            { description(yytext(),"Numero decimal"); return symbol(sym.NDECIMAL, yytext());
            }
          // fall through
          case 89: break;
          case 34:
            { description(yytext(),"Bucle for"); return symbol(sym.FOR, yytext());
            }
          // fall through
          case 90: break;
          case 35:
            { description(yytext(),"Tipo entero"); return symbol(sym.INT, yytext());
            }
          // fall through
          case 91: break;
          case 36:
            { description(yytext(),"Instanciacion de objeto"); return symbol(sym.NEW, yytext());
            }
          // fall through
          case 92: break;
          case 37:
            { description(yytext(),"Comentario multilinea");
            }
          // fall through
          case 93: break;
          case 38:
            { description(yytext(),"Tipo booleano"); return symbol(sym.BOOL, yytext());
            }
          // fall through
          case 94: break;
          case 39:
            { description(yytext(),"Tipo caracter"); return symbol(sym.CHAR, yytext());
            }
          // fall through
          case 95: break;
          case 40:
            { description(yytext(),"Alternativa condicional"); return symbol(sym.ELSE, yytext());
            }
          // fall through
          case 96: break;
          case 41:
            { description(yytext(),"Verdadero"); return symbol(sym.TRUE, yytext());
            }
          // fall through
          case 97: break;
          case 42:
            { description(yytext(),"Tipo de retorno vacio"); return symbol(sym.VOID, yytext());
            }
          // fall through
          case 98: break;
          case 43:
            { description(yytext(),"Declaracion de clase"); return symbol(sym.CLASS, yytext());
            }
          // fall through
          case 99: break;
          case 44:
            { description(yytext(),"Falso"); return symbol(sym.FALSE, yytext());
            }
          // fall through
          case 100: break;
          case 45:
            { description(yytext(),"Tipo flotante"); return symbol(sym.FLOAT, yytext());
            }
          // fall through
          case 101: break;
          case 46:
            { description(yytext(),"Declaracion de uso"); return symbol(sym.USING, yytext());
            }
          // fall through
          case 102: break;
          case 47:
            { description(yytext(),"Bucle while"); return symbol(sym.WHILE, yytext());
            }
          // fall through
          case 103: break;
          case 48:
            { description(yytext(),"Acceso publico"); return symbol(sym.PUBLIC, yytext());
            }
          // fall through
          case 104: break;
          case 49:
            { description(yytext(),"Declaracion de retorno"); return symbol(sym.RETURN, yytext());
            }
          // fall through
          case 105: break;
          case 50:
            { description(yytext(),"Miembro estatico"); return symbol(sym.STATIC, yytext());
            }
          // fall through
          case 106: break;
          case 51:
            { description(yytext(),"Tipo cadena"); return symbol(sym.STRING, yytext());
            }
          // fall through
          case 107: break;
          case 52:
            { description(yytext(),"Declaracion de paquete"); return symbol(sym.PACKAGE, yytext());
            }
          // fall through
          case 108: break;
          case 53:
            { description(yytext(),"Acceso privado"); return symbol(sym.PRIVATE, yytext());
            }
          // fall through
          case 109: break;
          case 54:
            { description(yytext(),"Acceso interno"); return symbol(sym.INTERNAL, yytext());
            }
          // fall through
          case 110: break;
          case 55:
            { description(yytext(),"Declaracion de espacio de nombres"); return symbol(sym.NAMESPACE, yytext());
            }
          // fall through
          case 111: break;
          case 56:
            { description(yytext(),"Acceso protegido"); return symbol(sym.PROTECTED, yytext());
            }
          // fall through
          case 112: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java LexerTL [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        LexerTL scanner = null;
        java.io.FileInputStream stream = null;
        java.io.Reader reader = null;
        try {
          stream = new java.io.FileInputStream(argv[i]);
          reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new LexerTL(reader);
          while ( !scanner.zzAtEOF ) scanner.next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
        finally {
          if (reader != null) {
            try {
              reader.close();
            }
            catch (java.io.IOException e) {
              System.out.println("IO error closing file \""+argv[i]+"\"");
              System.out.println(e);
            }
          }
          if (stream != null) {
            try {
              stream.close();
            }
            catch (java.io.IOException e) {
              System.out.println("IO error closing file \""+argv[i]+"\"");
              System.out.println(e);
            }
          }
        }
      }
    }
  }


}