package clem.app.core.ext.listener

import android.widget.SeekBar

/**
 * Created by leon
 * on 2019/7/10 16:28
 */
fun SeekBar.onProgressBarChanged(callback: (Int, Boolean) -> Unit) {
    setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
        override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
            callback(progress, fromUser)
        }

        override fun onStartTrackingTouch(seekBar: SeekBar?) {
        }

        override fun onStopTrackingTouch(seekBar: SeekBar?) {
        }
    })
}