      *================================================================*
       IDENTIFICATION                                  DIVISION.
      *================================================================*
       PROGRAM-ID. "003-Recebe dois núm e faz perg".
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
       WORKING-STORAGE                    SECTION.
       77 WRK-NUM1                        PIC S9(4) VALUE ZEROS.
       77 WRK-NUM2                        PIC S9(4) VALUE ZEROS.
       77 WRK-QUESTION                    PIC A(1) VALUE SPACES.
       77 WRK-RESTO                       PIC 9(2) VALUE ZEROS.
       77 WRK-RESTO2                      PIC 9(2) VALUE ZEROS.
       77 WRK-RESULTADO                   PIC 9(3) VALUE ZEROS.
    .
      *=================================================================
       PROCEDURE                                       DIVISION.
      *=================================================================
           ACCEPT WRK-NUM1
           ACCEPT WRK-NUM2

           DISPLAY 'A - IMPAR OU PAR'

           DISPLAY 'B - POSITIVO OU NEGATIVO'

           DISPLAY 'C - INTEIRO OU DECIMAL'

           DISPLAY 'Digite a opcao desejada: '

           ACCEPT WRK-QUESTION

           IF WRK-QUESTION EQUAL 'A'
               DIVIDE WRK-NUM1 BY 2 GIVING WRK-RESULTADO
                                    REMAINDER WRK-RESTO
               DIVIDE WRK-NUM2 BY 2 GIVING WRK-RESULTADO
                                    REMAINDER WRK-RESTO2
               IF WRK-RESTO GREATER 0 AND WRK-RESTO2 GREATER 0
                   DISPLAY WRK-NUM1 ' E ' WRK-NUM2 ' É IMPAR '
               END-IF

               IF WRK-RESTO GREATER 0 AND WRK-RESTO2 LESS 1
                   DISPLAY WRK-NUM1 ' EH IMPAR E ' WRK-NUM2 ' EH PAR'
               END-IF

               IF WRK-RESTO LESS 0 AND WRK-RESTO2 GREATER 1
                   DISPLAY WRK-NUM1 ' EH PAR E ' WRK-NUM2 ' EH IMPAR'
               END-IF

               IF WRK-RESTO EQUAL 0 AND WRK-RESTO2 EQUAL 0
                   DISPLAY 'EH PAR'
               END-IF

           END-IF

           IF WRK-QUESTION EQUAL 'B'
               IF WRK-NUM1 IS POSITIVE AND WRK-NUM2 IS POSITIVE
                   DISPLAY 'EH TUDO POSITIVO'
               END-IF

               IF WRK-NUM1 IS NEGATIVE AND WRK-NUM2 IS POSITIVE
                   DISPLAY WRK-NUM1 ' EH NEGATIVO E ' WRK-NUM2 ' EH +'
               END-IF

               IF WRK-NUM1 IS POSITIVE AND WRK-NUM2 IS NEGATIVE
                   DISPLAY WRK-NUM1 ' EH POSITIVO E ' WRK-NUM2 ' EH - '
               END-IF

               IF WRK-NUM1 IS NEGATIVE AND WRK-NUM2 IS NEGATIVE
                   DISPLAY WRK-NUM1 ' E ' WRK-NUM2 ' EH NEGATIVO'
               END-IF
           END-IF




           STOP RUN.
