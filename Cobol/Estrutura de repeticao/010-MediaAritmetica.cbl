      *================================================================*
       IDENTIFICATION                                  DIVISION.
      *================================================================*
       PROGRAM-ID. "001-PedeNotaDe0A10".
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
       77 WRK-NUMERO                   PIC 9(3) VALUE ZEROS.
       77 WRK-SOMA                     PIC 9(4) VALUE ZEROS.
       77 WRK-REPETICAO                PIC 9(1) VALUE ZEROS.
       77 WRK-CONTADOR                 PIC 9(2) VALUE ZEROS.

      *=================================================================
       PROCEDURE                                       DIVISION.
      *=================================================================
           PERFORM UNTIL WRK-REPETICAO EQUAL 1
               DISPLAY 'Digite N numeros, e 0 para calcular: '
               ACCEPT WRK-NUMERO
               IF WRK-NUMERO NOT EQUAL 0
                   ADD WRK-NUMERO TO WRK-SOMA
                   ADD 1 TO WRK-CONTADOR
               END-IF

               IF WRK-NUMERO EQUAL 0
                   ADD 1 TO WRK-REPETICAO
                   COMPUTE WRK-SOMA EQUAL WRK-SOMA / WRK-CONTADOR
                   DISPLAY 'A media aritmetica e: ' WRK-SOMA
               END-IF
           END-PERFORM
           STOP RUN.
