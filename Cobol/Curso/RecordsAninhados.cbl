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
           05 FILLER    PIC X(1).
           05 WRK-IDADE PIC 9(2).
           05 FILLER    PIC X(1) VALUE "|".
           05 WRK-RA    PIC 9(7).
           05 FILLER    PIC X.
           05 DADOSPESSOAIS.
               10 WRK-ENDERECO   PIC A(17).
               10 FILLER         PIC X.
               10 WRK-RG         PIC 9(9).

       PROCEDURE DIVISION.
       MAIN-PROCEDURE.
           MOVE "Lucas Kurata" TO WRK-NOME.
           MOVE 19 TO WRK-IDADE.
           MOVE 1800794 TO WRK-RA.
           MOVE "Av Sousa Bandeira" TO WRK-ENDERECO.
           MOVE 559810386 TO WRK-RG.
.
           DISPLAY WRK-ALUNO.
            STOP RUN.
       END PROGRAM YOUR-PROGRAM-NAME.
