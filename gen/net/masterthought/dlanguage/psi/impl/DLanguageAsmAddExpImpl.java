// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static net.masterthought.dlanguage.psi.DLanguageTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.masterthought.dlanguage.psi.*;

public class DLanguageAsmAddExpImpl extends ASTWrapperPsiElement implements DLanguageAsmAddExp {

  public DLanguageAsmAddExpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitAsmAddExp(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLanguageAsmAddExp getAsmAddExp() {
    return findChildByClass(DLanguageAsmAddExp.class);
  }

  @Override
  @NotNull
  public DLanguageAsmMulExp getAsmMulExp() {
    return findNotNullChildByClass(DLanguageAsmMulExp.class);
  }

  @Override
  @Nullable
  public PsiElement getOpMinus() {
    return findChildByType(OP_MINUS);
  }

  @Override
  @Nullable
  public PsiElement getOpPlus() {
    return findChildByType(OP_PLUS);
  }

}
