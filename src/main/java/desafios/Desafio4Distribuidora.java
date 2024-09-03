package desafios;

public class Desafio4Distribuidora {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        double perCentoSp = (sp / total) * 100;
        double perCentoRj = (rj / total) * 100;
        double perCentoMg = (mg / total) * 100;
        double perCentoEs = (es / total) * 100;
        double perCentoOutros = (outros / total) * 100;

        System.out.printf("Percentual SP: %.2f%%%n", perCentoSp);
        System.out.printf("Percentual RJ: %.2f%%%n", perCentoRj);
        System.out.printf("Percentual MG: %.2f%%%n", perCentoMg);
        System.out.printf("Percentual ES: %.2f%%%n", perCentoEs);
        System.out.printf("Percentual OUTROS: %.2f%%%n", perCentoOutros);
    }
}
