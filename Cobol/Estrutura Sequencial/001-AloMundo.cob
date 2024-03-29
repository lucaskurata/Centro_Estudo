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

       77 WRK-METRO                PIC 9(5) VALUE ZEROS.
       77 WRK-CENTIMETRO           PIC 9(5) VALUE ZEROS.
      *=================================================================
       PROCEDURE                                       DIVISION.
      *=================================================================
           MOVE 15 TO WRK-METRO
           COMPUTE WRK-CENTIMETRO EQUAL WRK-METRO*100
           DISPLAY WRK-CENTIMETRO
           STOP RUN.
