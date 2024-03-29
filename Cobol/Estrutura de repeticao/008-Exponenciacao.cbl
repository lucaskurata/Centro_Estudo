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
       77 WRK-BASE                     PIC 9(2) VALUE ZEROS.
       77 WRK-EXPOENTE                 PIC 9(2) VALUE ZEROS.

      *=================================================================
       PROCEDURE                                       DIVISION.
      *=================================================================
           ACCEPT WRK-BASE
           COMPUTE WRK-BASE EQUAL WRK-BASE ** WRK-EXPOENTE
           DISPLAY 'O resultado eh: ' WRK-BASE

           STOP RUN.
x''
