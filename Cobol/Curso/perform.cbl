      ******************************************************************
      * Author:
      * Date:
      * Purpose:
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. testePerform.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       77  WRK-DESCONTO            PIC 9(3).
       77  WRK-VALOR               PIC 9(4).
       77  WRK-RESULTADO           PIC 9(4).
       PROCEDURE DIVISION.

           DISPLAY 'EXECUTANDO PROGRAMA DE DESCONTO'
           MOVE 1260 TO WRK-VALOR.
           MOVE 100 TO WRK-DESCONTO.
           PERFORM CALCULADESCONTO.

           CALCULADESCONTO.
           COMPUTE WRK-RESULTADO EQUAL WRK-VALOR - WRK-DESCONTO.
           DISPLAY 'RESULTADO ' WRK-RESULTADO.

           STOP RUN.
       END PROGRAM testePerform.
