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
       77  WRK-NUMERO       PIC 9(3) VALUE ZEROS.
       77  WRK-LIMITE       PIC 9 VALUE ZEROS.
       77  WRK-NUM          PIC 9(2) VALUE 0.
       77  WRK-RESULTADO    PIC 9(3) VALUE ZEROS.

       PROCEDURE DIVISION.
       MAIN-PROCEDURE.
           DISPLAY "Digite o numero desejado: "
           ACCEPT WRK-NUMERO.
           GO TO DESVIAFLUXO.
           PERFORM UNTIL WRK-LIMITE EQUAL 1
               IF WRK-LIMITE EQUAL ZEROS
                   COMPUTE WRK-RESULTADO EQUAL WRK-NUMERO * WRK-NUM
                   DISPLAY WRK-RESULTADO
                   ADD 1 TO WRK-NUM
               END-IF
               IF WRK-NUM EQUAL 11
                   ADD 1 TO WRK-LIMITE
               END-IF
           END-PERFORM.


           DESVIAFLUXO.
               DISPLAY "DESVIEI O FLUXO DA CALCULADORA, E NÃO VOLTAREI
      -    "MAIS NO MESMO LUGAR QUE EU FUI CHAJMADO".
           END PROGRAM YOUR-PROGRAM-NAME.
