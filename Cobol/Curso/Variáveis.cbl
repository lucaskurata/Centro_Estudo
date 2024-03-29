      *================================================================*
       IDENTIFICATION                                  DIVISION.
      *================================================================*
       PROGRAM-ID. "AULA03".
       AUTHOR. "LUCAS KURATA".
      *================================================================*
       ENVIRONMENT                                     DIVISION.
      *=================================================================
      *-----------------------------------------------------------------
       CONFIGURATION                          SECTION.
      *-----------------------------------------------------------------

       SPECIAL-NAMES.


      *-----------------------------------------------------------------
       INPUT-OUTPUT                           SECTION.
      *=================================================================

      *=================================================================
      *-----------------------------------------------------------------
       FILE-CONTROL.
      *=================================================================
       DATA                                            DIVISION.
      *=================================================================
      *-----------------------------------------------------------------
       FILE                                   SECTION.
      *-----------------------------------------------------------------
      *-----------------------------------------------------------------
       WORKING-STORAGE                     SECTION.
       77  WRK-USUARIO                         PIC X(20) VALUE 'Lucas KU
      -'RATA123'.

       77  WRK-NOME                            PIC A(12) VALUE 'Lucas Ku
      -'rata'.

       77  WRK-NEGATIVO                        PIC S9(3) VALUE -100.
      *77  PONTOS-FLUTUANTES                   PIC 9(2)V2 VALUE 30.75 .

       77  WRK-DECIMAL                         PIC 9(3)V9(2).
           COPY "working.cpy".


      *-----------------------------------------------------------------
      *=================================================== ==============
       PROCEDURE                                       DIVISION.
      *=================================================================
           DISPLAY WRK-USUARIO .

           DISPLAY 'OLA MUNDO'.

           MOVE 'X' TO ws-teste
           MOVE 12345678910 TO WS-TESTE2
           DISPLAY ws-teste ' ' WS-TESTE2.

           DISPLAY WRK-NOME.

           DISPLAY WRK-NEGATIVO.

           DISPLAY "==============".
           MOVE 123.99 TO WRK-DECIMAL.
           DISPLAY WRK-DECIMAL.

      *    DISPLAY PONTOS-FLUTUANTES.
           STOP RUN.
