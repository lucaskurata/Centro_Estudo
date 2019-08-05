       IDENTIFICATION                                  DIVISION.
      *================================================================*
       PROGRAM-ID. "SalarioCompleto".
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

       77 WRK-GANHO-HORA                     PIC 9(3) VALUE ZEROS.
       77 WRK-HORAS-TRABALHADAS              PIC 9(3) VALUE ZEROS.
       77 WRK-IR                             PIC 9(3) VALUE ZEROS.
       77 WRK-INSS                           PIC 9(3) VALUE ZEROS.
       77 WRK-SINDICATO                      PIC 9(3) VALUE ZEROS.
       77 WRK-SALARIO-LIQUIDO                PIC 9(5) VALUE ZEROS.
       77 WRK-BRUTO                          PIC 9(5) VALUE ZEROS.
      *=================================================================
       PROCEDURE                                       DIVISION.
      *=================================================================
           MOVE 15 TO WRK-GANHO-HORA
           MOVE 120 TO WRK-HORAS-TRABALHADAS
           COMPUTE WRK-BRUTO EQUAL WRK-GANHO-HORA*WRK-HORAS-TRABALHADAS
           DISPLAY 'ANTES: 'WRK-BRUTO
           COMPUTE WRK-IR EQUAL WRK-BRUTO * 0.11
           COMPUTE WRK-INSS EQUAL WRK-BRUTO * 0.08
           COMPUTE WRK-SINDICATO EQUAL WRK-BRUTO * 0.05

           DISPLAY 'IMPOSTO DE RENDA' WRK-IR
           DISPLAY 'INSS ' WRK-INSS
           DISPLAY 'SINDICATO ' WRK-SINDICATO
           COMPUTE WRK-SALARIO-LIQUIDO EQUAL (WRK-BRUTO - WRK-INSS - WRK
      -    -SINDICATO)
           DISPLAY 'SALARIO LIQUIDO: ' WRK-SALARIO-LIQUIDO
           STOP RUN.
