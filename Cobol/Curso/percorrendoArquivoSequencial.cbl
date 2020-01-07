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
           SELECT OPTIONAL DADOS
               ASSIGN TO "cliente.dat"
               ORGANIZATION IS LINE SEQUENTIAL.
       DATA DIVISION.
       FILE SECTION.

       FD  DADOS.
       01  CLIENTE.
           05 WRK-NOME     PIC A(15).
           05 WRK-IDADE    PIC 9(2).
           05 FILLER       PIC X.
           05 WRK-EMAIL    PIC A(20).
           05 FILLER       PIC X.
           05 WRK-TELEFONE PIC 9(11).

       WORKING-STORAGE SECTION.
       77  WRK-FIM-LEITURA   PIC A(3).

       PROCEDURE DIVISION.
       PROGRAM-BEGIN.

           OPEN INPUT DADOS.
               PERFORM PERCORRE-ARQUIVO UNTIL WRK-FIM-LEITURA
               EQUAL "f".
           CLOSE DADOS.

       PROGRAM-DONE.
           STOP RUN.

       PERCORRE-ARQUIVO.
           READ DADOS RECORD AT END
           MOVE "fim" TO WRK-FIM-LEITURA.

           PERFORM EXIBE-CAMPO.

       EXIBE-CAMPO.
           DISPLAY "Nome completo: " WRK-NOME.
           DISPLAY "Idade: " WRK-IDADE.
           DISPLAY "E-mail: " WRK-EMAIL.
           DISPLAY "Telefone: " WRK-TELEFONE.
           DISPLAY "===========================".
