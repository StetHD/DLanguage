// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageTypeidExpression extends PsiElement {

  @Nullable
  DLanguageExpression getExpression();

  @Nullable
  DLanguageType getType();

  @NotNull
  PsiElement getKwTypeid();

  @NotNull
  PsiElement getOpParLeft();

  @NotNull
  PsiElement getOpParRight();

}
