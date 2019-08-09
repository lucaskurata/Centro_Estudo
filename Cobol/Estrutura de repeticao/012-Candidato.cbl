      *================================================================*
       IDENTIFICATION                                  DIVISION.
      *================================================================*
       PROGRAM-ID. "010 - Media aritmetica".
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
       77 WRK-A                        PIC A(10) VALUE SPACES.
       77 WRK-B                        PIC A(10) VALUE SPACES.
       77 WRK-C                        PIC A(10) VALUE SPACES.
       77 WRK-ELEITORES                PIC 9(4) VALUE ZEROS.
       77 WRK-VOTOA                    PIC 9(3) VALUE ZEROS.
       77 WRK-VOTOB                    PIC 9(3) VALUE ZEROS.
       77 WRK-VOTOC                    PIC 9(3) VALUE ZEROS.
       77 WRK-VOTOS                    PIC A(3) VALUE SPACES.
       77 WRK-REPETICAO                PIC 9(4) VALUE ZEROS.


      *=================================================================
       PROCEDURE                                       DIVISION.
      *=================================================================
           DISPLAY 'Digite o nome do CANDIDATO A'
           ACCEPT WRK-A

           DISPLAY 'Digite o nome do CANDIDATO B'
           ACCEPT WRK-B

           DISPLAY 'Digite o nome do CANDIDATO C'
           ACCEPT WRK-C

           DISPLAY 'Digite o total de numeros de eleitores: '
           ACCEPT WRK-ELEITORES

           PERFORM UNTIL WRK-REPETICAO EQUAL WRK-ELEITORES

               ACCEPT WRK-VOTOS

               IF WRK-VOTOS EQUAL 'A' OR WRK-VOTOS EQUAL 'a'
                   ADD 1 TO WRK-VOTOA
               END-IF

               IF WRK-VOTOS EQUAL 'B' OR WRK-VOTOS EQUAL 'b'
                   ADD 1 TO WRK-VOTOB
               END-IF

               IF WRK-VOTOS EQUAL 'C' OR WRK-VOTOS EQUAL 'c'
                   ADD 1 TO WRK-VOTOC
               END-IF

               ADD 1 TO WRK-REPETICAO

           END-PERFORM

           DISPLAY 'Eleitor: ' WRK-A '| Total: ' WRK-VOTOA
           DISPLAY 'Eleitor: ' WRK-B '| Total: ' WRK-VOTOC
           DISPLAY 'Eleitor: ' WRK-C '| Total: ' WRK-VOTOC

           STOP RUN.

      *Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores.
      *Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.
