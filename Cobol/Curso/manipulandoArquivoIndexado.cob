      ******************************************************************
      * Author:
      * Date:
      * Purpose:
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. YOUR-PROGRAM.
       ENVIRONMENT DIVISION.
       INPUT-OUTPUT SECTION.
       FILE-CONTROL.
           SELECT OPTIONAL CADASTRO
               ASSIGN TO "cadastro.txt"
               ORGANIZATION IS INDEXED
               ACCESS MODE  IS DYNAMIC
               RECORD KEY   IS WRK-CODIGO.

       DATA DIVISION.
       FILE SECTION.

       FD  CADASTRO.
       01  PESSOA.
           05 WRK-CODIGO   PIC 9(2).
           05 WRK-NOME     PIC 9(20).
           05 WRK-EMAIL    PIC A(20).
           05 WRK-ENDERECO PIC A(3).

       WORKING-STORAGE SECTION.
       77  WRK-PERGUNTA   PIC A(3).

       PROCEDURE DIVISION.
       PROGRAM-BEGIN.

           OPEN OUTPUT CADASTRO.
               PERFORM PERGUNTA UNTIL WRK-PERGUNTA EQUAL "n" OR
               WRK-PERGUNTA EQUAL "N".

           CLOSE CADASTRO.

       PROGRAM-DONE.
           STOP RUN.

       PERGUNTA.
           DISPLAY "Digite o codigo: ".
           ACCEPT WRK-CODIGO.
           DISPLAY "Digite o nome: ".
           ACCEPT WRK-NOME.
           DISPLAY "Digite o email: ".
           ACCEPT WRK-EMAIL.
           DISPLAY "Digite o endereco: ".
           ACCEPT WRK-ENDERECO.

           DISPLAY "----------".
           DISPLAY "Deseja cadastrar mais um (S/N)? "
           ACCEPT WRK-PERGUNTA.
           WRITE PESSOA.
