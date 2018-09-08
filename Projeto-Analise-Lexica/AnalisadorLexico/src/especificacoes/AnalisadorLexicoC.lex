package analisadorLexico;

import java_cup.runtime.*;

import model.MiniCToken;

%%

%{


private MiniCToken createToken(String tipo, String lexema) {
    return new MiniCToken(tipo, lexema, yyline, yycolumn);
}

%}

%public
%class AnalisadorLexicoGerado
%type MiniCToken
%line
%column

NOVALINHA = \n | \r\n | \t\n
DIGITO = [0-9] 
LETRA = [A-Za-z]
PALAVRA = {LETRA}+

SIMBOLO = "|"
SIMBOLO1 = "=="
SIMBOLO2 = "!="
SIMBOLO3 = "<"
SIMBOLO4 = ">"
SIMBOLO5 = "<="
SIMBOLO6 = ">="
SIMBOLO7 = "+"
SIMBOLO8 = "-"
SIMBOLO9 = "*"
SIMBOLO10 = "/"

IDENTIFICADOR = ({LETRA}|_)({LETRA}|{DIGITO}|_)*
LITERALINTEIRO = {DIGITO}+
LITERALPONTOFLUTUANTE = ({DIGITO}+\.{DIGITO}+)

LITERALCARACTER = '([^'\\n]|\\.)'
LITERALSTRING = \"(([^\"]|\\\")*[^\\])?\"

OPERADORARITMETICO = ({SIMBOLO7} | {SIMBOLO8} | {SIMBOLO9} | {SIMBOLO10})
OPERADORCOMPARACAO = ({SIMBOLO1} | {SIMBOLO2} | {SIMBOLO3} | {SIMBOLO4} | {SIMBOLO5} | {SIMBOLO6})
OPERADORLOGICOAND = (&(&))
OPERADORLOGICOOR = ({SIMBOLO}{SIMBOLO})
OPERADORATRIBUICAO = [=]
OPERADORUNARIONEGACAO = [!]

SIMBOLODEPONTUACAO = [:;,(){}.#&]

INPUTCHARACTER = [^\r\n]
LINETERMINATOR = \r|\n|\r|\n
TRADITIONALCOMMENT = "/*" [^*] ~"*/" | "/*" "*"+ "/"
ENDOFLINECOMMENT = "//" {INPUTCHARACTER}* {LINETERMINATOR}?
DOCUMENTATIONCOMMENT = "/**" {COMMENTCONTENT} "*"+ "/"
COMMENTCONTENT = ( [^*] | \*+ [^/*])*
COMENTARIO = {TRADITIONALCOMMENT} | {ENDOFLINECOMMENT} | {DOCUMENTATIONCOMMENT}

%%

"char"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"else"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"if"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"int"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"float"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"double"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"main"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"printf"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"printint"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"printstr"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"return"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"static"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"void"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"while"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"for"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"do"	{ return createToken("PALAVRA-CHAVE", yytext()); }
"include"	{ return createToken("PALAVRA-CHAVE", yytext()); }


{IDENTIFICADOR} { return createToken("IDENTIFICADOR", yytext()); }
{LITERALINTEIRO} { return createToken("LITERALINTEIRO", yytext()); }
{LITERALPONTOFLUTUANTE} { return createToken("LITERALPONTOFLUTUANTE", yytext()); }

{LITERALCARACTER} { return createToken("LITERALCARACTER", yytext()); }

{LITERALSTRING} { return createToken("LITERALSTRING", yytext()); }

{OPERADORARITMETICO} { return createToken("OPERADORARITMETICO", yytext()); }
{OPERADORCOMPARACAO} { return createToken("OPERADORCOMPARACAO", yytext()); }
{OPERADORLOGICOAND} { return createToken("OPERADORLOGICOAND", yytext()); }
{OPERADORLOGICOOR} { return createToken("OPERADORLOGICOOR", yytext()); }
{OPERADORATRIBUICAO} { return createToken("OPERADORATRIBUICAO", yytext()); }
{OPERADORUNARIONEGACAO} { return createToken("OPERADORUNARIONEGACAO", yytext()); }

{SIMBOLODEPONTUACAO} { return createToken("SIMBOLODEPONTUACAO", yytext()); }

{COMENTARIO} { /**/ }

{NOVALINHA} { /**/ }

. { }