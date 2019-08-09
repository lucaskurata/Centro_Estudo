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
       77 WRK-1                        PIC A(1) VALUE 'A'.
       77 WRK-2                        PIC A(1) VALUE 'B'.
       77 WRK-3                        PIC A(1) VALUE 'B'.
       77 WRK-4                        PIC A(1) VALUE 'A'.
       77 WRK-5                        PIC A(1) VALUE 'C'.
       77 WRK-6                        PIC A(1) VALUE 'D'.
       77 WRK-7                        PIC A(1) VALUE 'A'.
       77 WRK-8                        PIC A(1) VALUE 'D'.
       77 WRK-9                        PIC A(1) VALUE 'E'.
       77 WRK-10                       PIC A(1) VALUE 'A'.
       77 WRK-RESPOSTA                 PIC A(1) VALUE SPACES.
       77 WRK-REPETICAO                PIC 9(1) VALUE ZEROS.
       77 WRK-NOTAS                    PIC 9(2) VALUE ZEROS.

      *=================================================================
       PROCEDURE                                       DIVISION.
      *=================================================================
           PERFORM UNTIL WRK-REPETICAO EQUAL 10
           DISPLAY 'Digite as notas: '
           ACCEPT WRK-RESPOSTA
               IF WRK-RESPOSTA EQUAL WRK-1 OR WRK-RESPOSTA EQUAL WRK-2
                   ADD 1 TO WRK-NOTAS
               END-IF

               IF WRK-RESPOSTA EQUAL WRK-3 OR WRK-RESPOSTA EQUAL WRK-4
                   ADD 1 TO WRK-NOTAS
               END-IF

               IF WRK-RESPOSTA EQUAL WRK-5 OR WRK-RESPOSTA EQUAL WRK-6
                   ADD 1 TO WRK-NOTAS
               END-IF

               IF WRK-RESPOSTA EQUAL WRK-7 OR WRK-RESPOSTA EQUAL WRK-8
                   ADD 1 TO WRK-NOTAS
               END-IF

               IF WRK-RESPOSTA EQUAL WRK-9 OR WRK-RESPOSTA EQUAL WRK-10
                   ADD 1 TO WRK-NOTAS
               END-IF

               DISPLAY WRK-NOTAS

               ADD 1 TO WRK-REPETICAO

           END-PERFORM


           STOP RUN.

      *O Departamento Estadual de Meteorologia lhe contratou para desenvolver
      *um programa que leia as um conjunto indeterminado de temperaturas, e
      *informe ao final a menor e
      *a maior temperaturas informadas, bem como a média das temperaturas.
