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
       77 WRK-QUANTIDADE               PIC 9(2) VALUE ZEROS.
       77 WRK-ALUNOS                   PIC 9(2) VALUE ZEROS.
       77 WRK-SOMA                     PIC 9(3)V9(2) VALUE ZEROS.
       77 WRK-CONT                     PIC 9(2) VALUE ZEROS.
       77 WRK-PERFORM                  PIC 9(3) VALUE ZEROS.


      *=================================================================
       PROCEDURE                                       DIVISION.
      *=================================================================
           DISPLAY 'Digite a quantidade de turmas: '
           ACCEPT WRK-QUANTIDADE

           PERFORM UNTIL WRK-PERFORM EQUAL WRK-QUANTIDADE

               DISPLAY 'Digite a quantidade total de alunos por turma: '
               ACCEPT WRK-ALUNOS

               ADD WRK-ALUNOS TO WRK-SOMA

               ADD 1 TO WRK-PERFORM

           END-PERFORM

           COMPUTE WRK-SOMA EQUAL WRK-SOMA / WRK-PERFORM
           DISPLAY 'A media eh de: ' WRK-SOMA ' por turma'

           STOP RUN.

      *Fa�a um programa que calcule o n�mero m�dio de alunos por turma. Para isto, pe�a
      *a quantidade de turmas e a quantidade de alunos para cada turma.
      *As turmas n�o podem ter mais de 40 alunos.
