package com.mycompany.siscons.View;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class JsonCepConnection {
    private String cep;
    private String response;
    static String webService = "http://viacep.com.br/ws/";
    static int codigoSucesso = 200;
    private static ObjectMapper objectMapper = getDefaultObjectMapper();
    
    private static ObjectMapper getDefaultObjectMapper()
    {
        ObjectMapper defaultObjectMapper = new ObjectMapper();
        defaultObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return defaultObjectMapper;
    }
    
    public static Adress buscaEnderecoPelo(String cep) throws Exception 
    {
        String urlParaChamada = webService + cep + "/json";

        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso)
                JOptionPane.showMessageDialog(null, "CEP não encontrado");

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonEmString = converteJsonEmString(resposta);

            Gson gson = new Gson();
            Adress endereco = gson.fromJson(jsonEmString, Adress.class);

            return endereco;
        } catch (IOException | RuntimeException e) {
            throw new Exception("ERRO: " + e);
        }
    }
    
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException 
    {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
    
    public String getCep() 
    {
        return cep;
    }

    public void setCep(String cep) 
    {
        this.cep = cep;
    }
}