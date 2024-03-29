      *Faça um Programa que peça dois números e imprima a soma.
      *================================================================*
       IDENTIFICATION                                  DIVISION.
      *================================================================*
       PROGRAM-ID. "ExibeNumeroInformado!".
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

       77 WRK-NUMERO1                           PIC 9(5) VALUE ZEROS.
       77 WRK-NUMERO2                           PIC 9(5) VALUE ZEROS.
       77 WRK-TOTAL                             PIC 9(5) VALUE ZEROS.

      *=================================================================
       PROCEDURE                                       DIVISION.
      *=================================================================
           ACCEPT WRK-NUMERO1
           ACCEPT WRK-NUMERO2
           COMPUTE WRK-TOTAL EQUAL (WRK-NUMERO1 + WRK-NUMERO2) / 2
           DISPLAY 'A media foi: ' WRK-TOTAL
           STOP RUN.
