package c.mars.performanceanalysisex;

import android.support.annotation.IntRange;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created by mars on 6/11/15.
 */
@Data @RequiredArgsConstructor @AllArgsConstructor
public class Item {
    @NonNull
    private String n;
    @IntRange(from=0, to=255)
    private int v;
    private final boolean b;
}
