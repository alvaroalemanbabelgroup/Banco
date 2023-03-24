Ejercicio 1

Tenemos un banco donde tenemos que dar servicio a los clientes mediante nuestro API REST.
El banco tendrá sucursales que tendrá que sacar un listado de sucursales con id, nombre, director y dirección. Se podrán dar de alta nuevas sucursales e incluso modificar, listar y borrar. En el detalle de una sucursal mostraremos los datos de la sucursal sin el id.
Existen clientes que queremos dar de alta con los siguientes datos personales como DNI, nombre, dirección postal, email, teléfono y sucursal principal. También querríamos poder modificarlos, borrarlos, listarlos y acceder a un cliente en concreto mediante su Id, DNI o email.
En el detalle del cliente aparecerán, tanto los datos personales del cliente, como las cuentas que tenga contratadas con el balance de cada una, de tal forma que con la llamada al detalle del cliente nos devuelta toda la información.
Estos clientes tendrán cuentas asociadas, las que podremos dar de alta con los siguientes datos: Número de cuenta (20 dígitos), sucursal, id de usuario y balance (importe total de la cuenta).
Las cuentas se pueden dar de alta, modificar, listar, borrar y ver el detalle de la cuenta que será indicar el número de la cuenta y el balance únicamente.

Se necesita generar un servicio web REST que responda las peticiones con ficheros JSON. 
