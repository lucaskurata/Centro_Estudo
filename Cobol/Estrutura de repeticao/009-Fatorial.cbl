      *================================================================*
       IDENTIFICATION                                  DIVISION.
      *================================================================*
       PROGRAM-ID. "009-Fatorial".
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
       77 WRK-NUMERO                   PIC 9(2) VALUE ZEROS.
       77 WRK-REPETICAO                PIC 9(2) VALUE ZEROS.
       77 WRK-NUMERO2                  PIC 9(2) VALUE ZEROS.
       77 WRK-RESTO                    PIC 9(2) VALUE ZEROS.
       77 WRK-RESTO2                   PIC 9(2) VALUE ZEROS.
       77 WRK-RESULTADO                PIC 9(2) VALUE ZEROS.
       77 WRK-RESULTADO2                PIC 9(2) VALUE ZEROS.

      *=================================================================
       PROCEDURE                                       DIVISION.
      *=================================================================
           DISPLAY 'Digite um número: '
           ACCEPT WRK-NUMERO
           DIVIDE WRK-NUMERO BY WRK-NUMERO GIVING WRK-RESULTADO
                                           REMAINDER WRK-RESTO
                                           DISPLAY '1: ' WRK-RESULTADO
           DIVIDE WRK-NUMERO BY 1 GIVING WRK-RESULTADO2
                                           REMAINDER WRK-RESTO2
                                           DISPLAY '1: ' WRK-RESULTADO2
           IF WRK-RESULTADO EQUAL 1 AND WRK-RESULTADO2 EQUAL WRK-NUMERO
               DISPLAY 'EH PRIMO: 'WRK-NUMERO
           END-IF

           IF WRK-RESTO NOT EQUAL ZERO AND WRK-RESTO2 NOT EQUAL ZERO
               DISPLAY 'NAO EH PRIMO... '
           END-IF


           STOP RUN.
