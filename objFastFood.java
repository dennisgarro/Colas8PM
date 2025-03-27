public class objFastFood {
    int NumOrden;
    String TipoFood;
    Double Price;
    int Cantidad;

    public objFastFood(objFastFood o) {
        this.NumOrden = o.NumOrden;
        this.TipoFood = o.TipoFood;
        this.Price = o.Price;
        this.Cantidad = o.Cantidad;
    }

    public objFastFood() {
    }

    public int getNumOrden() {
        return NumOrden;
    }

    public objFastFood(int numOrden, String tipoFood, Double price, int cantidad) {
        NumOrden = numOrden;
        TipoFood = tipoFood;
        Price = price;
        Cantidad = cantidad;
    }

    public void setNumOrden(int numOrden) {
        NumOrden = numOrden;
    }

    public String getTipoFood() {
        return TipoFood;
    }

    public void setTipoFood(String tipoFood) {
        TipoFood = tipoFood;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        this.Cantidad = cantidad;
    }

}