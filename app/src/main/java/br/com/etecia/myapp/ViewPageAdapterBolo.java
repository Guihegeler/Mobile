package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPageAdapterBolo extends FragmentStateAdapter {


    public ViewPageAdapterBolo(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new BoloDePoteFragment();
            case 1: return new BoloFragment();
            default: return new BoloDePoteFragment();
        }

    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
