      ******************************************************************
      * Author:
      * Date:
      * Purpose:
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. YOUR-PROGRAM-NAME.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       77  WRK-NUMERO              PIC 9(4).
       77  WRK-MULTIPLICADOR       PIC 9(4).
       77  WRK-RESULTADO           PIC 9(4).
       77  WRK-REPETICOES          PIC 9(4).

       PROCEDURE DIVISION.
       MAIN-PROCEDURE.
           PERFORM PERGUNTA-NUMEROS.

           STOP RUN.

       PERGUNTA-NUMEROS.
           DISPLAY "Digite o número desejado: ".
           ACCEPT WRK-NUMERO.
           DISPLAY "Digite a quantidade do multiplicador".
           ACCEPT WRK-REPETICOES.
           MOVE 0 TO WRK-MULTIPLICADOR.
           PERFORM CALCULA WRK-REPETICOES TIMES.
       CALCULA.
           ADD 1 TO WRK-MULTIPLICADOR.
           COMPUTE WRK-RESULTADO EQUAL WRK-NUMERO * WRK-MULTIPLICADOR.
           DISPLAY WRK-NUMERO " * " WRK-MULTIPLICADOR " = " WRK-RESULTAD
      -O.
       END PROGRAM YOUR-PROGRAM-NAME.
