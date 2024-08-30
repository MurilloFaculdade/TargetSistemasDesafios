package desafios;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Desafio3Faturamento {
    public static void main(String[] args) {
        try {
            String jsonContent = readFile("src/faturamento.json");
            JSONObject jsonObject = new JSONObject(jsonContent);
            JSONArray faturamento = jsonObject.getJSONArray("faturamentos");

            double faturamentoMin = Double.MAX_VALUE;
            double faturamentoMax = Double.MIN_VALUE;
            double total = 0;
            int diasFaturando = 0;
            for (int i = 0; i < faturamento.length(); i++) {
                JSONObject item = faturamento.getJSONObject(i);
                double valor = item.getDouble("valor");

                if (valor > 0) {
                    if (valor < faturamentoMin) {
                        faturamentoMin = valor;
                    }
                    if (valor > faturamentoMax) {
                        faturamentoMax = valor;
                    }
                    total += valor;
                    diasFaturando++;
                }
            }

            double mediaFaturamento = total / diasFaturando;
            int diasAcimaDaMedia = 0;
            for (int i = 0; i < faturamento.length(); i++) {
                JSONObject item = faturamento.getJSONObject(i);
                double valor = item.getDouble("valor");

                if (valor > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor faturamento : " + faturamentoMin);
            System.out.println("Maior faturamento : " + faturamentoMax);
            System.out.println("Faturamento diário maior que a média: " + diasAcimaDaMedia);

        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler aquivo", e);
        }
    }

    private static String readFile(String path) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        }
        return sb.toString();
    }
}
