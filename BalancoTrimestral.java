class BalancoTrimestral{
    
    public static void main(String []args){
        double gastosJaneiro=15000;
        double gastosFevereiro=23000;
        double gastosMarco=17000;
        double gastosTrimestre= gastosJaneiro + gastosFevereiro + gastosMarco;
        double mediaMensal= gastosTrimestre/3;
        
        System.out.println ("Gasto Trimestre = " +gastosTrimestre);
        System.out.println ("Valor da media mensal = " +mediaMensal);

    }

}
