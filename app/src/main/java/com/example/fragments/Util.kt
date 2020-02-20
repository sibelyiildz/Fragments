package com.example.fragments

import android.util.Log


/**     Code with ❤
╔════════════════════════════╗
║  Created by Sibel YILDIZ  ║
╠════════════════════════════╣
║ sibelyldz2012@gmail.com ║
╠════════════════════════════╣
║     20/02/2020 - 00:05     ║
╚════════════════════════════╝
 */

infix fun String.logError(className: String) {
    Log.e(className, this)
}