package com.froi.asignaciondecursos.gramatica;

import java_cup.runtime.*;
import static com.froi.asignaciondecursos.gramatica.EntradaParserSym.*;

%%
%public
%class EntradaLexer
%cup
%unicode
%line
%column

USUARIO = "Usuario"
EDIFICIO = "Edificio"
SALON = "Salon"
CURSO = "Curso"
ESTUDIANTE = "Estudiante"
CATEDRATICO = "Catedratico"
HORARIO = "Horario"
ASIGNAR = "Asignar"

A_COLABORADOR = "colaborador"
A_ESTUDIANTE = "estudiante"

COMILLAS = ( [\“] | [\”] | [\"] )

ALFANUMERICO = {COMILLAS} [^\"\”\“]+ {COMILLAS}
NUMERO = [0-9]+

PARA = "("
PARC = ")"
COMA = ","
PUNTO_COMA = ";"

%%

<YYINITIAL> {

    {USUARIO}       {return new Symbol(USUARIO, yyline+1, yycolumn+1, yytext());}    
    {EDIFICIO}      {return new Symbol(EDIFICIO, yyline+1, yycolumn+1, yytext());}    
    {SALON}         {return new Symbol(SALON, yyline+1, yycolumn+1, yytext());}
    {CURSO}         {return new Symbol(CURSO, yyline+1, yycolumn+1, yytext());}
    {ESTUDIANTE}    {return new Symbol(ESTUDIANTE, yyline+1, yycolumn+1, yytext());}
    {CATEDRATICO}   {return new Symbol(CATEDRATICO, yyline+1, yycolumn+1, yytext());}
    {HORARIO}       {return new Symbol(HORARIO, yyline+1, yycolumn+1, yytext());}
    {ASIGNAR}       {return new Symbol(ASIGNAR, yyline+1, yycolumn+1, yytext());}
    {A_COLABORADOR} {return new Symbol(A_COLABORADOR, yyline+1, yycolumn+1, yytext());}
    {A_ESTUDIANTE}  {return new Symbol(A_ESTUDIANTE, yyline+1, yycolumn+1, yytext());}
    {ALFANUMERICO}  {return new Symbol(ALFANUMERICO, yyline+1, yycolumn+1, yytext());}
    {NUMERO}        {return new Symbol(NUMERO, yyline+1, yycolumn+1, yytext());}
    {PARA}          {return new Symbol(PARA, yyline+1, yycolumn+1, yytext());}
    {PARC}          {return new Symbol(PARC, yyline+1, yycolumn+1, yytext());}
    {COMA}          {return new Symbol(COMA, yyline+1, yycolumn+1, yytext());}
    {PUNTO_COMA}    {return new Symbol(PUNTO_COMA, yyline+1, yycolumn+1, yytext());}
}

[^] {

}