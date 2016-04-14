package com.gmail.collinsmith70.unifi.unifi.graphics.drawable.shape;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.gmail.collinsmith70.unifi.unifi.graphics.Canvas;
import com.gmail.collinsmith70.unifi.unifi.graphics.Paint;
import com.gmail.collinsmith70.unifi.unifi.math.Dimension2D;

public abstract class Shape {

  private int width;
  private int height;

  public abstract void draw(@NonNull final Canvas canvas, @NonNull final Paint paint);

  public final void resize(@IntRange(from = 0, to = Integer.MAX_VALUE) final int width,
                           @IntRange(from = 0, to = Integer.MAX_VALUE) final int height) {
    setWidth(width);
    setHeight(height);
    onResize(width, height);
  }

  protected void onResize(@IntRange(from = 0, to = Integer.MAX_VALUE) final int width,
                          @IntRange(from = 0, to = Integer.MAX_VALUE) final int height) {}

  @IntRange(from = 0, to = Integer.MAX_VALUE)
  public final int getWidth() {
    return width;
  }

  private void setWidth(@IntRange(from = 0, to = Integer.MAX_VALUE) final int width) {
    if (width < 0) {
      throw new IllegalArgumentException("width must be greater than or equal to 0");
    } else if (getWidth() == width) {
      return;
    }

    this.width = width;
  }

  @IntRange(from = 0, to = Integer.MAX_VALUE)
  public final int getHeight() {
    return height;
  }

  private void setHeight(@IntRange(from = 0, to = Integer.MAX_VALUE) final int height) {
    if (height < 0) {
      throw new IllegalArgumentException("height must be greater than or equal to 0");
    } else if (getHeight() == height) {
      return;
    }

    this.height = height;
  }

  @NonNull
  public Dimension2D getSize() {
    return new Dimension2D(getWidth(), getHeight());
  }

  @NonNull
  public Dimension2D getSize(@Nullable final Dimension2D dst) {
    if (dst == null) {
      return getSize();
    }

    dst.set(getWidth(), getHeight());
    return dst;
  }

}
