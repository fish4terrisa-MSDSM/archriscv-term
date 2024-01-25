package fish4terrisa.archlinux.riscv64.floatwindows;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
/**
 * Simple activity which immediately launches {@link TermuxFloatService} and exits.
 */
public class TermuxFloatActivity extends Activity {

    @Override
    protected void onResume() {
        super.onResume();
	try {
        startService(new Intent(this, TermuxFloatService.class));
	} catch (Exception ex)
    {
        Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
    }
        finish();
    }
}
