
package tienda.persistencia;

import tienda.entidades.Producto;


public final class ProductoDAO extends DAO{
    
    public void guardarProducto(Producto producto) throws Exception{
        try {
            if (producto == null) {
                throw new Exception("El producto no es valido");
            }
            String sql = "INSET INTO producto (codigo,nombre,precio,codigo_fabricante)"
                    + "VALUES ( '" +  producto.getCodigo() + "' , '" + producto.getNombre() + "' , '" + producto.getPrecio() + "' , '" + producto.getCodigoFabricante()+ "'):";
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarProducto (Producto producto) throws Exception{
        
        try {
            if (producto == null) {
                throw new Exception("El producto es erroneo");
            }
            
            //Modifica el nombre y el precio. Se mantiene el codigo y el codigo fabricante
            String sql = "UPDATE producto SET"
                    + "nombre = '"+producto.getNombre()+"','"+producto.getPrecio()+"' WHERE codigo = '"+producto.getCodigo()+"'";
            InsertModifElim(sql);
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void eliminarProducto (int codigo) throws Exception{
        try {

            //Elimino todos los datos del producto por el codigo
            String sql = "DELETE * FROM producto WHERE codigo = '"+codigo+"'";
            InsertModifElim(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
