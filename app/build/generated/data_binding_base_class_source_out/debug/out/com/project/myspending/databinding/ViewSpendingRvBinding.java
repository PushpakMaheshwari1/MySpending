// Generated by view binder compiler. Do not edit!
package com.project.myspending.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.project.myspending.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewSpendingRvBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final RecyclerView spendingRecyclerView;

  @NonNull
  public final MaterialTextView totalAmount;

  @NonNull
  public final MaterialTextView totalItem;

  private ViewSpendingRvBinding(@NonNull MaterialCardView rootView,
      @NonNull RecyclerView spendingRecyclerView, @NonNull MaterialTextView totalAmount,
      @NonNull MaterialTextView totalItem) {
    this.rootView = rootView;
    this.spendingRecyclerView = spendingRecyclerView;
    this.totalAmount = totalAmount;
    this.totalItem = totalItem;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewSpendingRvBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewSpendingRvBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_spending_rv, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewSpendingRvBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.spendingRecyclerView;
      RecyclerView spendingRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (spendingRecyclerView == null) {
        break missingId;
      }

      id = R.id.totalAmount;
      MaterialTextView totalAmount = ViewBindings.findChildViewById(rootView, id);
      if (totalAmount == null) {
        break missingId;
      }

      id = R.id.totalItem;
      MaterialTextView totalItem = ViewBindings.findChildViewById(rootView, id);
      if (totalItem == null) {
        break missingId;
      }

      return new ViewSpendingRvBinding((MaterialCardView) rootView, spendingRecyclerView,
          totalAmount, totalItem);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
