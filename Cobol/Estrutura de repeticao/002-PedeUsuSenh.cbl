      *================================================================*
       IDENTIFICATION                                  DIVISION.
      *================================================================*
       PROGRAM-ID. "001-PedeUsuESenh".
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
       77 WRK-USUARIO                  PIC A(12) VALUE SPACES.
       77 WRK-SENHA                    PIC X(10) VALUE SPACES.
       77 WRK-REPETICAO                PIC 9(1) VALUE ZEROS.
      *=================================================================
       PROCEDURE                                       DIVISION.
      *=================================================================
           PERFORM UNTIL WRK-REPETICAO EQUAL 1
               DISPLAY 'Digite o usuario: '
               ACCEPT WRK-USUARIO
               DISPLAY 'Digite a senha: '
               ACCEPT WRK-SENHA

               IF FUNCTION LOWER-CASE(WRK-USUARIO) NOT EQUAL FUNCTION LO
      -    WER-CASE (WRK-SENHA)
                   DISPLAY 'Valores aceitos'
                   ADD 1 TO WRK-REPETICAO
               END-IF

               IF WRK-USUARIO EQUAL WRK-SENHA
                   DISPLAY 'Valores repetidos, digite novamente'
               END-IF

           END-PERFORM

           STOP RUN.
