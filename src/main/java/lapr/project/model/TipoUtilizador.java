/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

public enum TipoUtilizador {
    UTILIZADOR {
        public String toString() {
            return "Utilizador";
        }
    },
    ORGANIZADOR {
        public String toString() {
            return "Organizador";
        }
    },
    FAE {
        public String toString() {
            return "FAE";
        }
    },
    GESTOR_DE_EXPOSICOES {
        public String toString() {
            return "Gestor de Exposições";
        }
    },
    REPRESENTANTE_DE_EXPOSITOR {
        public String toString() {
            return "Representante de expositor";
        }
    };

}
