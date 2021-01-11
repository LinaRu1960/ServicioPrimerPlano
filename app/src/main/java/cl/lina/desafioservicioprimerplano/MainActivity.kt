package cl.lina.desafioservicioprimerplano

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*
    Instrucciones Generales
[X] 1. Creación del proyecto con el layout que contiene el textView y el botón para implementar la
        funcionalidad
[X] 2. Creación de clase con ForegroundService que extiende de Service
[] 3. Agregar la declaración del servicio y los permisos en AndroidManifest.xml
[] 4. ForegroundService debe tener un indicador de su estado (iniciado/detenido) y el contador de
        ejecuciones
[] 5. MainActivity implementa Handler.Callback para recibir mensajes desde el servicio y presentar la
        información de cantidad de ejecuciones
    Paso a Paso
[X] 1. Crear proyecto android, api mínima 21, targetSdk 29.
[X] 2. Modificar diseño layout por defecto activity_main.xml para incluir el TextView y el botón.
[X] 3. Habilitar el enlace de las vistas con MainActivity usando view binding o synthetic de las Kotlin
        extension.
[] 4. Crear la clase ForegroundService que extienda de Service e implementar los callbacks
        necesarios.
[] 5. Declarar en el manifesto la clase ForegroundService dentro de app.
[] 6. Indicar el permiso para ejecución del servicio usando .
[] 7. MainActivity implementa la interfaz Handler.Callback para registrarse con el servicio y que sea
        notificado cuando ocurra un evento, implementando handleMessage().
[] 8. Enlazar las vistas de ser necesario.
[] 9. Agregar la funcionalidad de onClickListener al botón para iniciar/detener el servicio.
[] 10. Probar la app usando AVD, otro emulador o un dispositivo físico.
 */


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}