
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.froi.asignaciondecursos.gramatica;

import com.froi.asignaciondecursos.entidades.*;
import com.froi.asignaciondecursos.estructuras.*;
import com.froi.asignaciondecursos.manejadores.*;
import java_cup.runtime.*;
import javax.swing.JTextArea;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class EntradaParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return EntradaParserSym.class;
}

  /** Default constructor. */
  @Deprecated
  public EntradaParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public EntradaParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public EntradaParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\026\000\002\002\004\000\002\002\004\000\002\002" +
    "\002\000\002\004\004\000\002\004\004\000\002\004\004" +
    "\000\002\004\004\000\002\004\004\000\002\004\004\000" +
    "\002\004\004\000\002\004\004\000\002\005\014\000\002" +
    "\003\003\000\002\003\003\000\002\003\003\000\002\006" +
    "\006\000\002\007\012\000\002\010\014\000\002\011\012" +
    "\000\002\012\012\000\002\013\022\000\002\014\014" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\141\000\024\002\uffff\004\uffff\005\uffff\006\uffff\007" +
    "\uffff\010\uffff\011\uffff\012\uffff\013\uffff\001\002\000\024" +
    "\002\016\004\021\005\020\006\007\007\026\010\022\011" +
    "\023\012\012\013\014\001\002\000\004\023\143\001\002" +
    "\000\004\023\142\001\002\000\004\021\133\001\002\000" +
    "\004\023\132\001\002\000\004\023\131\001\002\000\004" +
    "\021\112\001\002\000\004\023\111\001\002\000\004\021" +
    "\100\001\002\000\004\023\077\001\002\000\004\002\001" +
    "\001\002\000\004\023\076\001\002\000\004\021\073\001" +
    "\002\000\004\021\057\001\002\000\004\021\050\001\002" +
    "\000\004\021\041\001\002\000\004\023\040\001\002\000" +
    "\024\002\000\004\000\005\000\006\000\007\000\010\000" +
    "\011\000\012\000\013\000\001\002\000\004\021\027\001" +
    "\002\000\004\020\030\001\002\000\004\024\031\001\002" +
    "\000\004\017\032\001\002\000\004\024\033\001\002\000" +
    "\004\020\034\001\002\000\004\024\035\001\002\000\004" +
    "\020\036\001\002\000\004\022\037\001\002\000\004\023" +
    "\ufff0\001\002\000\024\002\ufffc\004\ufffc\005\ufffc\006\ufffc" +
    "\007\ufffc\010\ufffc\011\ufffc\012\ufffc\013\ufffc\001\002\000" +
    "\004\020\042\001\002\000\004\024\043\001\002\000\004" +
    "\017\044\001\002\000\004\024\045\001\002\000\004\017" +
    "\046\001\002\000\004\022\047\001\002\000\004\023\uffee" +
    "\001\002\000\004\020\051\001\002\000\004\024\052\001" +
    "\002\000\004\017\053\001\002\000\004\024\054\001\002" +
    "\000\004\017\055\001\002\000\004\022\056\001\002\000" +
    "\004\023\uffef\001\002\000\004\020\060\001\002\000\004" +
    "\024\061\001\002\000\004\017\062\001\002\000\004\024" +
    "\063\001\002\000\004\017\064\001\002\000\004\024\065" +
    "\001\002\000\010\014\070\015\071\016\067\001\002\000" +
    "\004\022\072\001\002\000\004\022\ufff3\001\002\000\004" +
    "\022\ufff5\001\002\000\004\022\ufff4\001\002\000\004\023" +
    "\ufff6\001\002\000\004\017\074\001\002\000\004\022\075" +
    "\001\002\000\004\023\ufff2\001\002\000\024\002\ufffe\004" +
    "\ufffe\005\ufffe\006\ufffe\007\ufffe\010\ufffe\011\ufffe\012\ufffe" +
    "\013\ufffe\001\002\000\024\002\ufff9\004\ufff9\005\ufff9\006" +
    "\ufff9\007\ufff9\010\ufff9\011\ufff9\012\ufff9\013\ufff9\001\002" +
    "\000\004\020\101\001\002\000\004\024\102\001\002\000" +
    "\004\020\103\001\002\000\004\024\104\001\002\000\004" +
    "\020\105\001\002\000\004\024\106\001\002\000\004\020" +
    "\107\001\002\000\004\022\110\001\002\000\004\023\uffec" +
    "\001\002\000\024\002\ufffa\004\ufffa\005\ufffa\006\ufffa\007" +
    "\ufffa\010\ufffa\011\ufffa\012\ufffa\013\ufffa\001\002\000\004" +
    "\020\113\001\002\000\004\024\114\001\002\000\004\017" +
    "\115\001\002\000\004\024\116\001\002\000\004\017\117" +
    "\001\002\000\004\024\120\001\002\000\004\020\121\001" +
    "\002\000\004\024\122\001\002\000\004\020\123\001\002" +
    "\000\004\024\124\001\002\000\004\017\125\001\002\000" +
    "\004\024\126\001\002\000\004\020\127\001\002\000\004" +
    "\022\130\001\002\000\004\023\uffed\001\002\000\024\002" +
    "\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb\011\ufffb" +
    "\012\ufffb\013\ufffb\001\002\000\024\002\ufffd\004\ufffd\005" +
    "\ufffd\006\ufffd\007\ufffd\010\ufffd\011\ufffd\012\ufffd\013\ufffd" +
    "\001\002\000\004\017\134\001\002\000\004\024\135\001" +
    "\002\000\004\020\136\001\002\000\004\024\137\001\002" +
    "\000\004\020\140\001\002\000\004\022\141\001\002\000" +
    "\004\023\ufff1\001\002\000\024\002\ufff7\004\ufff7\005\ufff7" +
    "\006\ufff7\007\ufff7\010\ufff7\011\ufff7\012\ufff7\013\ufff7\001" +
    "\002\000\024\002\ufff8\004\ufff8\005\ufff8\006\ufff8\007\ufff8" +
    "\010\ufff8\011\ufff8\012\ufff8\013\ufff8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\141\000\004\002\003\001\001\000\024\004\024\005" +
    "\016\006\007\007\023\010\010\011\012\012\014\013\004" +
    "\014\005\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\003\065\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$EntradaParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$EntradaParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$EntradaParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    private ListaDobleEnlazadaC<Edificio> edificios;
    private ArbolAVL<Catedratico> catedraticos;
    private JTextArea salida;

    public EntradaParser(EntradaLexer lexer, ManejadorPrincipal manejadorPrincipal, JTextArea salida) {
        super(lexer);
        this.edificios = manejadorPrincipal.getEdificios();
        this.catedraticos = manejadorPrincipal.getCatedraticos();
        this.salida = salida;
        this.salida.setText("Resultado de la lectura: \n");
    }
    public void report_error(String message, Object info) {
        System.out.println("reporterror");
    }
    public void report_fatal_error(String message, Object info) {
        System.out.println("reportfatal");
    }
    public void syntax_error(Symbol cur_token) {
        System.out.println("syntaxerr " + symbl_name_from_id(cur_token.sym) + " " + cur_token.left + " - " + cur_token.right);
    }
    protected int error_sync_size() {
        return 1;
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$EntradaParser$actions {
  private final EntradaParser parser;

  /** Constructor */
  CUP$EntradaParser$actions(EntradaParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$EntradaParser$do_action_part00000000(
    int                        CUP$EntradaParser$act_num,
    java_cup.runtime.lr_parser CUP$EntradaParser$parser,
    java.util.Stack            CUP$EntradaParser$stack,
    int                        CUP$EntradaParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$EntradaParser$result;

      /* select the action based on the action number */
      switch (CUP$EntradaParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).value;
		RESULT = start_val;
              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$EntradaParser$parser.done_parsing();
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= inicio opciones 
            {
              Object RESULT =null;

              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicio ::= 
            {
              Object RESULT =null;

              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // opciones ::= usuarios PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("opciones",2, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // opciones ::= edificios PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("opciones",2, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // opciones ::= salones PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("opciones",2, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // opciones ::= cursos PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("opciones",2, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // opciones ::= estudiantes PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("opciones",2, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // opciones ::= catedraticos PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("opciones",2, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // opciones ::= horarios PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("opciones",2, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // opciones ::= asignaciones PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("opciones",2, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // usuarios ::= USUARIO PARA NUMERO COMA ALFANUMERICO COMA ALFANUMERICO COMA tipo_usuario PARC 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-7)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-7)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-7)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).right;
		Object v2 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).value;
		int v3left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).left;
		int v3right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).right;
		Object v3 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).value;
		int v4left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).left;
		int v4right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).right;
		String v4 = (String)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).value;

              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("usuarios",3, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-9)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // tipo_usuario ::= A_COLABORADOR 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.peek()).value;
		RESULT = val.toString();
              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("tipo_usuario",1, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // tipo_usuario ::= A_ESTUDIANTE 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.peek()).value;
		RESULT = val.toString();
              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("tipo_usuario",1, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // tipo_usuario ::= A_SUPER 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.peek()).value;
		RESULT = val.toString();
              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("tipo_usuario",1, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // edificios ::= EDIFICIO PARA ALFANUMERICO PARC 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).value;
		
                    Edificio edificio = new Edificio(v1.toString().replace("\"", ""));
                    edificios.insertar(edificio);
                    salida.append(edificio + "\n\n");
                
              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("edificios",4, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // salones ::= SALON PARA ALFANUMERICO COMA NUMERO COMA NUMERO PARC 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).right;
		Object v2 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).value;
		int v3left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).left;
		int v3right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).right;
		Object v3 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).value;
		
                    String nombre = v1.toString().replace("\"", ""); int numero = Integer.parseInt(v2.toString()); int capacidad = Integer.parseInt(v3.toString());
                    Edificio edificio;
                    if((edificio = edificios.buscar(nombre)) != null) {
                        ListaEnlazada salonesEdificio = edificio.getSalones();
                        Salon salonProv = new Salon(numero, capacidad);
                        salonesEdificio.insertar(salonProv);
                        salida.append("En el Edificio " + nombre + " se ha creado:\n" + salonProv + "\n\n");
                    } else {
                        salida.append("No se ha encontrado el edificio: " + nombre + ". El salón: " + numero + " no ha podido ser creado.\n\n");
                    }
                
              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("salones",5, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-7)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // cursos ::= CURSO PARA NUMERO COMA ALFANUMERICO COMA NUMERO COMA NUMERO PARC 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-7)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-7)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-7)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).right;
		Object v2 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).value;
		int v3left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).left;
		int v3right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).right;
		Object v3 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).value;
		int v4left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).left;
		int v4right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).right;
		Object v4 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).value;

              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("cursos",6, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-9)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // estudiantes ::= ESTUDIANTE PARA NUMERO COMA ALFANUMERICO COMA ALFANUMERICO PARC 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).right;
		Object v2 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).value;
		int v3left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).left;
		int v3right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).right;
		Object v3 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).value;

              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("estudiantes",7, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-7)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // catedraticos ::= CATEDRATICO PARA NUMERO COMA ALFANUMERICO COMA ALFANUMERICO PARC 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).right;
		Object v2 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).value;
		int v3left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).left;
		int v3right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).right;
		Object v3 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).value;
		
                        long identificador = Long.parseLong(v1.toString()); String nombre = v2.toString().replace("\"", ""); String direccion = v3.toString().replace("\"", "");
                        try {
                            Catedratico catedraticoProv = new Catedratico(identificador, nombre, direccion);
                            catedraticos.insertar(catedraticoProv);
                            salida.append(catedraticoProv + "\n\n");
                        } catch(Exception e) {
                            System.out.println("Error al insertar al catedrático: ");
                            salida.append("Problemas para añadir al catedrático " + nombre + ".El catedrático ya existe o el número de identificación es muy grande\n\n");
                        }
                    
              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("catedraticos",8, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-7)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // horarios ::= HORARIO PARA NUMERO COMA ALFANUMERICO COMA ALFANUMERICO COMA NUMERO COMA NUMERO COMA ALFANUMERICO COMA NUMERO PARC 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-13)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-13)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-13)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-11)).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-11)).right;
		Object v2 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-11)).value;
		int v3left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-9)).left;
		int v3right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-9)).right;
		Object v3 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-9)).value;
		int v4left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-7)).left;
		int v4right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-7)).right;
		Object v4 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-7)).value;
		int v5left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).left;
		int v5right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).right;
		Object v5 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).value;
		int v6left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).left;
		int v6right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).right;
		Object v6 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).value;
		int v7left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).left;
		int v7right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).right;
		Object v7 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).value;

              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("horarios",9, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-15)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // asignaciones ::= ASIGNAR PARA NUMERO COMA NUMERO COMA NUMERO COMA NUMERO PARC 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-7)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-7)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-7)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).right;
		Object v2 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-5)).value;
		int v3left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).left;
		int v3right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).right;
		Object v3 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-3)).value;
		int v4left = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).left;
		int v4right = ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).right;
		Object v4 = (Object)((java_cup.runtime.Symbol) CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-1)).value;

              CUP$EntradaParser$result = parser.getSymbolFactory().newSymbol("asignaciones",10, ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.elementAt(CUP$EntradaParser$top-9)), ((java_cup.runtime.Symbol)CUP$EntradaParser$stack.peek()), RESULT);
            }
          return CUP$EntradaParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$EntradaParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$EntradaParser$do_action(
    int                        CUP$EntradaParser$act_num,
    java_cup.runtime.lr_parser CUP$EntradaParser$parser,
    java.util.Stack            CUP$EntradaParser$stack,
    int                        CUP$EntradaParser$top)
    throws java.lang.Exception
    {
              return CUP$EntradaParser$do_action_part00000000(
                               CUP$EntradaParser$act_num,
                               CUP$EntradaParser$parser,
                               CUP$EntradaParser$stack,
                               CUP$EntradaParser$top);
    }
}

}
