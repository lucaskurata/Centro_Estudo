      *================================================================*
       IDENTIFICATION                                  DIVISION.
      *================================================================*
       PROGRAM-ID. "ConverteMetrosParaCentimetros".
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

       77 WRK-CONTADOR                    PIC 9(1) VALUE ZEROS.
       77 WRK-REPETICAO                   PIC 9(1) VALUE ZEROS.
       77 WRK-RESPOSTA                    PIC A(1) VALUE SPACES.

      *=================================================================
       PROCEDURE                                       DIVISION.
      *=================================================================
           DISPLAY'Telefonou para a vítima?'
           DISPLAY'Esteve no local do crime?'
           DISPLAY'Mora perto da vítima?'
           DISPLAY'Devia para a vítima?'
           DISPLAY'Já trabalhou com a vítima?'

           PERFORM UNTIL WRK-REPETICAO EQUAL 5
               ACCEPT WRK-RESPOSTA
               IF WRK-RESPOSTA EQUAL 'SIM' OR 'S' OR 'sim' or 's'
                   COMPUTE WRK-CONTADOR EQUAL WRK-CONTADOR + 1
               END-IF
               COMPUTE WRK-REPETICAO EQUAL WRK-REPETICAO + 1
           END-PERFORM.

           IF WRK-CONTADOR EQUAL 2
               DISPLAY 'Suspeita'
           END-IF

           IF WRK-CONTADOR EQUAL 3 OR 4
               DISPLAY 'Cumplice'
           END-IF

           IF WRK-CONTADOR EQUAL 5
               DISPLAY 'Assassino! '
           END-IF

           IF WRK-CONTADOR EQUAL 0
               DISPLAY 'Inocente! '
           END-IF

           STOP RUN.
