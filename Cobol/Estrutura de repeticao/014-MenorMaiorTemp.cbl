      *================================================================*
       IDENTIFICATION                                  DIVISION.
      *================================================================*
       PROGRAM-ID. "014- MaiorMenorTemp".
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
       77 WRK-TEMPERATURA              PIC 9(2)V9(2) VALUE ZEROS.
       77 WRK-MAIOR                    PIC 9(2)V9(2) VALUE ZEROS.
       77 WRK-MENOR                    PIC 9(2)V9(2) VALUE ZEROS.
       77 WRK-SOMA                     PIC 9(2) VALUE ZEROS.
       77 WRK-DIVISAO                  PIC 9(2)V9(2) VALUE ZEROS.
       77 WRK-CONT                     PIC 9(2) VALUE ZEROS.


      *=================================================================
       PROCEDURE                                       DIVISION.
      *=================================================================
           PERFORM UNTIL WRK-TEMPERATURA EQUAL 1
           DISPLAY 'Digite as temperaturas: '
           ACCEPT WRK-TEMPERATURA
               IF WRK-TEMPERATURA GREATER 1
                   ADD WRK-TEMPERATURA TO WRK-SOMA
                   ADD 1 TO WRK-CONT
               END-IF
               IF WRK-TEMPERATURA GREATER WRK-MAIOR
                   MOVE WRK-TEMPERATURA TO WRK-MAIOR
               END-IF

               IF WRK-TEMPERATURA LESS WRK-MAIOR
                   MOVE WRK-TEMPERATURA TO WRK-MENOR
                   IF WRK-TEMPERATURA LESS WRK-MENOR
                       MOVE WRK-TEMPERATURA TO WRK-MENOR
                   END-IF
               END-IF

           END-PERFORM

           DIVIDE WRK-SOMA BY WRK-CONT GIVING WRK-DIVISAO
           DISPLAY 'Maior: ' WRK-MAIOR
           DISPLAY 'Menor: ' WRK-MENOR
           DISPLAY 'Media: ' WRK-DIVISAO

           STOP RUN.

      *O Departamento Estadual de Meteorologia lhe contratou para desenvolver
      *um programa que leia as um conjunto indeterminado de temperaturas, e
      *informe ao final a menor e
      *a maior temperaturas informadas, bem como a média das temperaturas.
