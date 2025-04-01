public class CuentaCorriente extends Cuenta implements GrabadorImpuesto{// interface con implements, tiene todos metodos abstractos y obligatorios a implementar
         private double descubiertoPermitido;


    public double getDescubiertoPermitido( ){
        return descubiertoPermitido;
    }

    public void setDescubiertoPermitido(double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }

    @Override
    public void extraer (double monto) {
        if (informarSaldo() + descubiertoPermitido >= monto)
            setSaldo(informarSaldo() - monto);

    }


    @Override
    public double gravar(double porcentaje) {
        double monto= informarSaldo()*porcentaje;
        setSaldo(informarSaldo()-monto);
        return monto;
    }
}
