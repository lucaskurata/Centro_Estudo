       IDENTIFICATION DIVISION.
       PROGRAM-ID. PROG36.
      *    PROGRAMA PARA INSERIR DADOS EM ARQUIVO INDEXADO.
      *     WRITE COM INVALID KEY.
       ENVIRONMENT DIVISION.
       INPUT-OUTPUT SECTION.
       FILE-CONTROL.
           SELECT ARQUIVO-FUNCIONARIO
           ASSIGN TO "funcionarios.dat"
           ORGANIZATION IS INDEXED
           RECORD KEY IS FUNCIONARIO-CODIGO
           ACCESS MODE IS DYNAMIC.
       DATA DIVISION.
       FILE SECTION.
       FD  ARQUIVO-FUNCIONARIO.
       01  FUNCIONARIO-REGISTRO.
           05 FUNCIONARIO-CODIGO PIC 9(4).
           05 FUNCIONARIO-NOME PIC X(20).
           05 FUNCIONARIO-ENDERECO PIC X(50).
           05 FUNCIONARIO-TELEFONE PIC X(15).
           05 FUNCIONARIO-EMAIL PIC X(30).

       WORKING-STORAGE SECTION.

       77  CONFIRMA-ALTERACAO PIC A(1).
       77  ALTERACAO          PIC 9(1).
       77  MUDANCA            PIC 9(1).
       77  WRK-REPLACE        PIC X(20).

       PROCEDURE DIVISION.
       PROGRA-BEGIN.
           OPEN I-O ARQUIVO-FUNCIONARIO.
               PERFORM PERCORRE-ARQUIVO.

           PERCORRE-ARQUIVO.
           READ ARQUIVO-FUNCIONARIO RECORD AT END
           PERFORM EXIBE-CAMPOS.

       EXIBE-CAMPOS.
           DISPLAY FUNCIONARIO-CODIGO.
           DISPLAY FUNCIONARIO-NOME.
           DISPLAY FUNCIONARIO-ENDERECO.
           DISPLAY FUNCIONARIO-TELEFONE.
           DISPLAY FUNCIONARIO-EMAIL.

           DISPLAY "====================".
           DISPLAY "Deseja alterar algum campo? (S/N)".
           ACCEPT CONFIRMA-ALTERACAO.

           IF CONFIRMA-ALTERACAO EQUAL "N"
               GO TO PROGRAM-DONE.

           IF CONFIRMA-ALTERACAO EQUAL "S"
               PERFORM REALIZA-ALTERACAO.


       REALIZA-ALTERACAO.
           DISPLAY "1- FUNCIONARIO-CODIGO".
           DISPLAY "2- FUNCIONARIO-NOME".
           DISPLAY "3-FUNCIONARIO-ENDERECO".
           DISPLAY "4-FUNCIONARIO-TELEFONE".
           DISPLAY "5-FUNCIONARIO-EMAIL".
           DISPLAY " ".

           DISPLAY "Qual campo quer alterar? (1,2,3,4,5/0)".
           ACCEPT ALTERACAO.

           IF ALTERACAO EQUAL 1 OR ALTERACAO EQUAL 2 OR ALTERACAO
               EQUAL 3 OR ALTERACAO EQUAL 4 OR ALTERACAO EQUAL 5
               PERFORM REALIZA-PERGUNTA.
           IF ALTERACAO EQUAL 0
               GO TO PROGRAM-DONE.

       REALIZA-PERGUNTA.
           MOVE "Y" TO MUDANCA.
           IF ALTERACAO EQUAL 1
               DISPLAY "Digite o novo c�digo: "
               ACCEPT FUNCIONARIO-CODIGO.

           IF ALTERACAO EQUAL 2
               DISPLAY "Digite o novo nome: "
               ACCEPT FUNCIONARIO-NOME.

           IF ALTERACAO EQUAL 3
               DISPLAY "Digite o novo endereco: "
               ACCEPT FUNCIONARIO-ENDERECO.

           IF ALTERACAO EQUAL 4
               DISPLAY "Digite o novo telefone: "
               ACCEPT FUNCIONARIO-TELEFONE.

           IF ALTERACAO EQUAL 5
               DISPLAY "Digite o novo e-mail: "
               ACCEPT FUNCIONARIO-EMAIL.

           PERFORM REESCREVE.

       REESCREVE.
           REWRITE FUNCIONARIO-REGISTRO.

           CLOSE ARQUIVO-FUNCIONARIO.

       PROGRAM-DONE.
           STOP RUN.
