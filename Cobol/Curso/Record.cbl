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

       01  WRK-ALUNO.
           05 WRK-NOME  PIC A(20).
           05 WRK-IDADE PIC 9(2).
           05 WRK-RA    PIC 9(8).

       PROCEDURE DIVISION.
       MAIN-PROCEDURE.
           MOVE "Lucas Kurata" TO WRK-NOME.
           MOVE 19 TO WRK-IDADE.
           MOVE 1800794 TO WRK-RA.

           DISPLAY WRK-ALUNO.
            STOP RUN.
       END PROGRAM YOUR-PROGRAM-NAME.
