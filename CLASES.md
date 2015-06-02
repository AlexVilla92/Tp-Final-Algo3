# Como organizar las clases
*Ideas de Daniel*

¿Ingles o español? Pongo todo en ingles pero podemos pasarlo

### World
Contiene una grilla con elementos (Diccionario de Coordinate -> Cell)

### Cell
Contiene una lista de "entities" en orden.

Por ejemplo, una cell con minerales ya construida tendría
> Tierra -> Minerales -> Recolector de minerales

### Entity
Todo aquello que existe en el mapa - Tierra, aire, unidades, minerales etc

Implementamos todo con interfaces sobre esto, ideas que se me ocurren
* Recolectable (minerales, gas; define si se le puede poner un recolector encima)
* Atacable (unidades, edificios; define si puede ser atacado)
* Atacante (unidades; define si puede atacar)
* Movible (unidades; define si puede moverse)

##### Entity -> ground
##### Entity -> air
##### Entity -> unit
##### Entity -> Mineral
##### Entity -> Gas

### Unit
Todo aquello que puede ser controlado por un jugador

##### Unit -> SmallUnit -> Marine
##### Unit -> SmallUnit -> Goliat
##### Unit -> SmallUnit -> Zealot
##### Unit -> Building -> GasHarvester

**EJEMPLO**

Podemos hacer que las Unit tengan su raza como propiedad

> this.Race = Terran;

si un Marine recibe daño, podemos hacer:

    void recieveDamage(int n) {
        this.Race.recieveDamage(this)
    }

y `race.recieveDamage()` modifica atributos de la Unit que se envia como argumento
