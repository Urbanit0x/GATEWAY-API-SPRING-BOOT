package com.gateway.redireccion.envios;

public class EnvioPublicRoutes {
    // Endpoints públicos GET
    public static final String[] ENVIOS_PUBLIC_GET = {
        //envios
        "/api/proxy/envios",            // Listar todos los envíos
        "/api/proxy/envios/",           // Idem (por si acaso)
        "/api/proxy/envios/{id}",       // Obtener envío por ID
        "/api/proxy/envios/{id}/",      // Por si acaso
        //ventas
        "/api/proxy/envios/ventas",            // Listar todas las ventas
        "/api/proxy/envios/ventas/",           // Idem (por si acaso)
        "/api/proxy/envios/ventas/{id}",       // Obtener venta por ID
        "/api/proxy/envios/ventas/{id}/",      // Por si acaso
    };

    // Endpoints públicos POST
    public static final String[] ENVIOS_PUBLIC_POST = {
        //envios
        "/api/proxy/envios",            // Crear un nuevo envío
        "/api/proxy/envios/",           // Por si acaso
        //ventas
        "/api/proxy/envios/ventas",            // Crear una nueva venta
        "/api/proxy/envios/ventas/",           // Por si acaso
    };

    // Endpoints públicos PUT
    public static final String[] ENVIOS_PUBLIC_PUT = {
        //envios
        "/api/proxy/envios/{id}",           // Actualizar envío por ID
        "/api/proxy/envios/{id}/",          // Por si acaso
        //ventas
        "/api/proxy/envios/ventas/{id}",           // Actualizar venta por ID
        "/api/proxy/envios/ventas/{id}/",          // Por si acaso
    };

    // Endpoints públicos DELETE
    public static final String[] ENVIOS_PUBLIC_DELETE = {
        //envios
        "/api/proxy/envios/{id}",       // Eliminar envío por ID
        "/api/proxy/envios/{id}/",      // Por si acaso
        //ventas
        "/api/proxy/envios/ventas/{id}",       // Eliminar venta por ID
        "/api/proxy/envios/ventas/{id}/",      // Por si acaso
    };
    
}
