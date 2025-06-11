package com.gateway.redireccion.inventario;

public class InventarioPublicRoutes {
    // Endpoints públicos GET
    public static final String[] INVENTARIO_PUBLIC_GET = {
        //inventario
        "/api/proxy/inventario",            // Listar todos los inventarios
        "/api/proxy/inventario/",           // Idem (por si acaso)
        "/api/proxy/inventario/{id}",       // Obtener inventario por ID
        "/api/proxy/inventario/{id}/",      // Por si acaso
        //productos
        "/api/proxy/inventario/productos",            // Listar todos los productos
        "/api/proxy/inventario/productos/",           // Idem (por si acaso)
        "/api/proxy/inventario/productos/{id}",       // Obtener producto por ID
        "/api/proxy/inventario/productos/{id}/",      // Por si acaso
    };

    // Endpoints públicos POST
    public static final String[] INVENTARIO_PUBLIC_POST = {
        //inventario
        "/api/proxy/inventario",            // Crear un nuevo inventario
        "/api/proxy/inventario/",           // Por si acaso
        //productos
        "/api/proxy/inventario/productos",            // Crear un nuevo producto
        "/api/proxy/inventario/productos/",           // Por si acaso
    };

    // Endpoints públicos PUT
    public static final String[] INVENTARIO_PUBLIC_PUT = {
        //inventario
        "/api/proxy/inventario/{id}",           // Actualizar inventario por ID
        "/api/proxy/inventario/{id}/",          // Por si acaso
        //productos
        "/api/proxy/inventario/productos/{id}",           // Actualizar producto por ID
        "/api/proxy/inventario/productos/{id}/",          // Por si acaso
    };

    // Endpoints públicos DELETE
    public static final String[] INVENTARIO_PUBLIC_DELETE = {
        //inventario
        "/api/proxy/inventario/{id}",       // Eliminar inventario por ID
        "/api/proxy/inventario/{id}/",      // Por si acaso
        //productos
        "/api/proxy/inventario/productos/{id}",       // Eliminar producto por ID
        "/api/proxy/inventario/productos/{id}/",      // Por si acaso
    };
}
