package br.ErroArray;

import java.io.*;

public class TesteArray {
    public static void main (String[] args){
        String[] frutas = {"maca, banana, mamao"};
        try {
            System.out.println("Fruta: " + frutas[3]);
        }catch (Exception e){
            System.out.println("Erro: "+e);
        }finally {
            System.out.println("Apos o erro");
        }

        String nome = null;
        try {
            if (nome.equals("Joao")) {
                System.out.println(nome);
            }
        }catch (NullPointerException e){
            System.out.println("Nome null "+e);
            nome = "João";
        }finally {
            if (nome.equals("João")){
                System.out.println("Bem vindo "+nome);
            }
        }
        //usando IO
        String[] nomes={"Joao", "Jose", "Joaquim"};
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("arquivo.txt"));
            for(String n: nomes){
                writer.write(n);
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("Erro "+e);
        }finally {
            try {
                writer.close();
                System.out.println("Arquivo Fechado");
            }catch (Exception e){
                System.out.println("Erro fechando arquivo: "+e);
            }
        }

        System.out.println("Lendo o arquivo");
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha="";
            while((linha = reader.readLine())!=null){
                System.out.println(linha);
            }
        }catch (IOException e){

        }
       try{
           testeErro("arq.txt");
       }catch (FileNotFoundException e){
           e.printStackTrace();
       }catch (IOException e){
           e.printStackTrace();
       }
    }

    public static void testeErro(String na) throws FileNotFoundException, IOException, IndexOutOfBoundsException{
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("arquivo.txt"));
        String linha="";
        while((linha = reader.readLine())!=null){
            System.out.println(linha);
        }

    }
}
