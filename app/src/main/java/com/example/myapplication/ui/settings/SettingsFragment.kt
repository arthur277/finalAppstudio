package com.example.ui.settings

import androidx.preference.PreferenceFragmentCompat
import android.os.Bundle
import com.example.myapplication2.R

class SettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }
}