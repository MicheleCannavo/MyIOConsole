/*------------------------------------------------------------------------------
 - Copyright (c) 2021 Cannavo' Michele. All right reserved.
 -
 -  This file is part of UtilConsole
 -
 -     UtilConsole is free software: you can redistribute it and/or modify
 -     it under the terms of the Lesser GNU General Public License as published by
 -     the Free Software Foundation, either version 3 of the License, or
 -     (at your option) any later version.
 -
 -     UtilConsole is distributed in the hope that it will be useful,
 -     but WITHOUT ANY WARRANTY; without even the implied warranty of
 -     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 -     Lesser GNU General Public License for more details.
 -
 -     You should have received a copy of the Lesser GNU General Public License
 -     along with UtilConsole.  If not, see <http://www.gnu.org/licenses/>.
 -----------------------------------------------------------------------------*/
package util.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Classe per gestione degli INPUT.
 *
 * @author Michele Cannavo'
 * @version 1.1.0
 * @copyright © 2021 - Cannavo' Michele
 * @license LGPL 3.0
 * @date 10/06/2021
 * @since 1.0.0
 */
public final class Input {
  private static final Logger LOGGER =
    LoggerFactory.getLogger(Input.class);

  /**
   * Classe statica.
   */
  private Input() {
  }

  /**
   * Previa stampa di un messaggio, preleva dalla console
   * o dal System.in, se non dovesse esserci una console connessa,
   * un input come stringa e lo restituisce al chiamante.
   *
   * @param   format  l formato dalla stringa per il messaggio.
   * @param   args    Gli argomenti del messaggio.
   *
   * @return  L'input  immesso sotto forma di stringa.
   *
   * @since   1.0.0
   */
  public static String readLine(String format, Object... args) {
    try {
      return System.console().readLine(format, args);
    } catch (NullPointerException excep1) {
      try (Scanner sc = new Scanner(new InputStreamReader(System.in))) {
        System.out.printf(format, args);
        return sc.nextLine();
      }
    }
  }


  /**
   * Previa stampa del messaggio: "password: ".
   * Permette l' immissione da util.console di una password
   * come avviene nelle console linux, ovvero senza mostrare i caratteri sul video.
   * Se non dovesse esserci una console connessa,
   * l' input avviene come per una stringa normale.
   *
   * @return L'input immesso sotto forma di stringa.
   *
   * @since 1.0.0
   */
  public static String readPassword() {
    String message = "Immetti password: ";
    try {
      return Arrays.toString(System.console().readPassword(message));
    } catch (NullPointerException ex) {
      LOGGER.warn("Password is visible: ".concat(ex.getMessage()));
      return readLine(message);
    }
  }
}